.class public final Ln0/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/bluetooth/BluetoothProfile$ServiceListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln0/q;->R()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln0/q;


# direct methods
.method constructor <init>(Ln0/q;)V
    .locals 0

    iput-object p1, p0, Ln0/q$b;->a:Ln0/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(ILandroid/bluetooth/BluetoothProfile;)V
    .locals 1

    const-string v0, "proxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ln0/q$b;->a:Ln0/q;

    check-cast p2, Landroid/bluetooth/BluetoothHeadset;

    invoke-static {p1, p2}, Ln0/q;->q(Ln0/q;Landroid/bluetooth/BluetoothHeadset;)V

    iget-object p1, p0, Ln0/q$b;->a:Ln0/q;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Found a headset: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ln0/q$b;->a:Ln0/q;

    invoke-static {v0}, Ln0/q;->p(Ln0/q;)Landroid/bluetooth/BluetoothHeadset;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Ln0/q;->o(Ln0/q;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected(I)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ln0/q$b;->a:Ln0/q;

    const-string v0, "Clearing headset: "

    invoke-static {p1, v0}, Ln0/q;->o(Ln0/q;Ljava/lang/String;)V

    iget-object p1, p0, Ln0/q$b;->a:Ln0/q;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ln0/q;->q(Ln0/q;Landroid/bluetooth/BluetoothHeadset;)V

    :cond_0
    return-void
.end method
