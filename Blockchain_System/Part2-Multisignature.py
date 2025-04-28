import tkinter as tk
from tkinter import messagebox
import hashlib

# PKG keys
p_pkg = 1004162036461488639338597000466705179253226703
q_pkg = 950133741151267522116252385927940618264103623
e_pkg = 973028207197278907211

# Procurement Officer keys
p_user = 1080954735722463992988394149602856332100628417
q_user = 1158106283320086444890911863299879973542293243
e_user = 106506253943651610547613

# Inventory identities
ID_A = 126
ID_B = 127
ID_C = 128
ID_D = 129

# Inventory random numbers
r_A = 621
r_B = 721
r_C = 821
r_D = 921

# PKG parameters calculation
n_pkg = p_pkg * q_pkg
phi_n_pkg = (p_pkg - 1) * (q_pkg - 1)
d_pkg = pow(e_pkg, -1, phi_n_pkg)

# User parameters
n_user = p_user * q_user
phi_n_user = (p_user - 1) * (q_user - 1)
d_user = pow(e_user, -1, phi_n_user)

# Secret keys for inventories
g_A = pow(ID_A, d_pkg, n_pkg)
g_B = pow(ID_B, d_pkg, n_pkg)
g_C = pow(ID_C, d_pkg, n_pkg)
g_D = pow(ID_D, d_pkg, n_pkg)

#------------------------------------------------------------------------------------------------------------#

def load_inventory(filename):
    inventory = {}
    with open(filename, 'r') as f:
        for line in f:
            parts = line.strip().split()
            if len(parts) >= 4:
                item_id = parts[0]
                quantity = int(parts[1])
                price = int(parts[2])
                location = parts[3]
                inventory[item_id] = (quantity, price, location)
    return inventory

inventory_A = load_inventory('Inventory_A.txt')
inventory_B = load_inventory('Inventory_B.txt')
inventory_C = load_inventory('Inventory_C.txt')
inventory_D = load_inventory('Inventory_D.txt')



# Returning inventory/qty/price/location
def get_quantity(item_id):
    for label, inv in (('A', inventory_A),
                       ('B', inventory_B),
                       ('C', inventory_C),
                       ('D', inventory_D)):
        if item_id in inv:
            qty, price, loc = inv[item_id]
            return label, qty, price, loc
    return None, None, None, None

# Computing hash of m by 256 hash
def compute_hash(t, m):
    t_bytes = t.to_bytes((t.bit_length() + 7) // 8, 'big')
    m_bytes = m.encode()
    digest = hashlib.sha256(t_bytes + m_bytes).digest()
    return int.from_bytes(digest, 'big')



  #  Retrieving item
def process_query(item_id):
    wh_label, quantity, price, location = get_quantity(item_id)
    if wh_label is None:
        return "Item not found"

    # message/record
    m = f"{item_id} {quantity} {wh_label} {price} {location}"

    # Multi-signature t
    t_A = pow(r_A, e_pkg, n_pkg)
    t_B = pow(r_B, e_pkg, n_pkg)
    t_C = pow(r_C, e_pkg, n_pkg)
    t_D = pow(r_D, e_pkg, n_pkg)
    t = (t_A * t_B * t_C * t_D) % n_pkg

    #  Hash H(t, m)
    H_tm = compute_hash(t, m)

    #  Partial signatures s_j
    s_A = (g_A * pow(r_A, H_tm, n_pkg)) % n_pkg
    s_B = (g_B * pow(r_B, H_tm, n_pkg)) % n_pkg
    s_C = (g_C * pow(r_C, H_tm, n_pkg)) % n_pkg
    s_D = (g_D * pow(r_D, H_tm, n_pkg)) % n_pkg
    s = (s_A * s_B * s_C * s_D) % n_pkg

    # Encryption of m with user’s public key
    m_int = int.from_bytes(m.encode(), 'big')
    c = pow(m_int, e_user, n_user)

    #  Decryption of message 
    m_int_dec = pow(c, d_user, n_user)
    m_dec = m_int_dec.to_bytes((m_int_dec.bit_length() + 7) // 8, 'big').decode()

    #  Verifying signature
    H_tm_dec = compute_hash(t, m_dec)
    left = pow(s, e_pkg, n_pkg)
    right = (
        ID_A * ID_B * ID_C * ID_D *
        pow(t, H_tm_dec, n_pkg)
    ) % n_pkg
    verification = "Signature accepted" if left == right else "Signature rejected"

    #  Pack result
    return (
        f"Queried item ID: {item_id}\n"
        f"Retrieved from Inventory {wh_label}: "
        f"quantity={quantity}, price={price}, location={location}\n\n"
        f"Message m: {m}\n"
        f"t (aggregate): {t}\n"
        f"s (aggregate sig): {s}\n"
        f"Encrypted c: {c}\n"
        f"Decrypted m: {m_dec}\n"
        f"Signature verification: {verification}"
    )

#------------------------------------------------------------------------------------------------------------#

# UI Setup
root = tk.Tk()
root.title("Inventory Query System")

tk.Label(root, text="Enter Item ID:").pack(pady=5)
entry = tk.Entry(root)
entry.pack(pady=5)

result_text = tk.Text(root, height=20, width=80)
result_text.pack(pady=5)

def on_query():
    item_id = entry.get().strip()
    if not item_id:
        messagebox.showerror("Error", "Please enter an Item ID")
        return
    result = process_query(item_id)
    result_text.delete(1.0, tk.END)
    result_text.insert(tk.END, result)

tk.Button(root, text="Query", command=on_query).pack(pady=10)

root.mainloop()

