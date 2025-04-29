.class public final Ld7/x$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/x;",
        "Ld7/x$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/x;->e0()Ld7/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/x$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/x$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/x$c$a;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/x$c;

    invoke-static {v0, p1}, Ld7/x;->f0(Ld7/x;Ld7/x$c;)V

    return-object p0
.end method

.method public I(Ld7/x$i;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-static {v0, p1}, Ld7/x;->h0(Ld7/x;Ld7/x$i;)V

    return-object p0
.end method

.method public J(Ld7/h$b;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/h;

    invoke-static {v0, p1}, Ld7/x;->j0(Ld7/x;Ld7/h;)V

    return-object p0
.end method

.method public K(Lcom/google/protobuf/a0$b;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/a0;

    invoke-static {v0, p1}, Ld7/x;->k0(Ld7/x;Lcom/google/protobuf/a0;)V

    return-object p0
.end method

.method public L(Ld7/h$b;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/h;

    invoke-static {v0, p1}, Ld7/x;->i0(Ld7/x;Ld7/h;)V

    return-object p0
.end method

.method public M(Ld7/x$h;)Ld7/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/x;

    invoke-static {v0, p1}, Ld7/x;->g0(Ld7/x;Ld7/x$h;)V

    return-object p0
.end method
