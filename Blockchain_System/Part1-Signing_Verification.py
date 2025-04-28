import os
import hashlib
import tkinter as tk
from tkinter import messagebox, ttk # Library for UI




#  Part_1
## Inventories (p, q, e)
inventories = [
    {
        'name': 'A',
        'p': 1210613765735147311106936311866593978079938707,
        'q': 1247842850282035753615951347964437248190231863,
        'e': 815459040813953176289801
    },
    {
        'name': 'B',
        'p': 787435686772982288169641922308628444877260947,
        'q': 1325305233886096053310340418467385397239375379,
        'e': 692450682143089563609787
    },
    {
        'name': 'C',
        'p': 1014247300991039444864201518275018240361205111,
        'q': 904030450302158058469475048755214591704639633,
        'e': 1158749422015035388438057
    },
    {
        'name': 'D',
        'p': 1287737200891425621338551020762858710281638317,
        'q': 1330909125725073469794953234151525201084537607,
        'e': 33981230465225879849295979
    }
]

# Calculation of n,phi_n((p-1)(q-1)),d for each inventories
for inv in inventories:
    inv['n'] = inv['p'] * inv['q']
    inv['phi_n'] = (inv['p'] - 1) * (inv['q'] - 1)
    inv['d'] = pow(inv['e'], -1, inv['phi_n'])


# Initializing each database in the fomr of txt files for each inventories(a,b,c,d)
def init_databases():
    for inv in inventories:
        filename = f"Inventory_{inv['name']}.txt"
        if not os.path.exists(filename):
            with open(filename, 'w') as f:
                f.write("Records:\n")

init_databases()



# Signing the message/record
def sign(record, d, n):
    m = int.from_bytes(hashlib.sha256(record.encode()).digest(), 'big')
    s = pow(m, d, n)
    return s

# Verifying the message/record
def verify(record, signature, e, n):
    m = int.from_bytes(hashlib.sha256(record.encode()).digest(), 'big')
    return pow(signature, e, n) == m


# Storing the record in all databases
def store_record(record):
    for inv in inventories:
        with open(f"Inventory_{inv['name']}.txt", 'a') as f:
            f.write(record + '\n')

#------------------------------------------------------------------------------------------------------------#


#  Part_2
## POA Concensus mechanism used
def consensus(signer, record, signature, output):
    votes = 0
    for inv in inventories:
        if verify(record, signature, signer['e'], signer['n']):
            votes += 1
            output.insert(tk.END, f"Inventory {inv['name']}: Signature verified\n")
        else:
            output.insert(tk.END, f"Inventory {inv['name']}: Signature rejected\n")
    result = (votes >= 3)
    output.insert(tk.END, f"Consensus {votes}/4 votes {'Reached' if result else 'Failed'}\n")
    return result


#------------------------------------------------------------------------------------------------------------#


# UI for ITEM_ID/QUANTITY/PRICE/LOCATION
root = tk.Tk()
root.title("Inventory Record Submission")

frame = tk.Frame(root)
frame.pack(pady=10, padx=10, fill="both", expand=True)
tk.Label(root, text="Inventory:").pack()
inv_var = tk.StringVar(value='A')
inv_combo = ttk.Combobox(root, textvariable=inv_var, values=['A', 'B', 'C', 'D'], state='readonly')
inv_combo.pack()

tk.Label(root, text="Item ID:").pack()
item_id_entry = tk.Entry(root)
item_id_entry.pack()

tk.Label(root, text="Quantity:").pack()
qty_entry = tk.Entry(root)
qty_entry.pack()

tk.Label(root, text="Price:").pack()
price_entry = tk.Entry(root)
price_entry.pack()

tk.Label(root, text="Location:").pack()
loc_entry = tk.Entry(root)
loc_entry.pack()

output = tk.Text(root, height=10, width=60)
output.pack()




# Getting Inventories adat form user
def UI_add():
    try:
        signer = next(inv for inv in inventories if inv['name'] == inv_var.get())
        record = f"{item_id_entry.get()} {qty_entry.get()} {price_entry.get()} {loc_entry.get()}"
    except StopIteration:
        messagebox.showerror("Error", "Invalid inventory selected")
        return

    # If no inputs
    if not record.replace(" ", ""):
        messagebox.showerror("Error", "All fields required")
        return

    # output cleareds + signed record
    output.delete(1.0, tk.END)
    s = sign(record, signer['d'], signer['n'])
    output.insert(tk.END, f"Inventory {signer['name']} signed: {s}\n")

    # Performing consensus and store if successful
    if consensus(signer, record, s, output):
        store_record(record)
        output.insert(tk.END, "Record stored\n")


# Running the UI
tk.Button(root, text="Add", command= UI_add).pack()
root.mainloop()