.class public final Ld7/y$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/y;",
        "Ld7/y$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/y;->e0()Ld7/y;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/y$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/y$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/y$c;)Ld7/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/y;

    invoke-static {v0, p1}, Ld7/y;->g0(Ld7/y;Ld7/y$c;)V

    return-object p0
.end method

.method public I(Ld7/y$d;)Ld7/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/y;

    invoke-static {v0, p1}, Ld7/y;->f0(Ld7/y;Ld7/y$d;)V

    return-object p0
.end method

.method public J(Lcom/google/protobuf/t1;)Ld7/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/y;

    invoke-static {v0, p1}, Ld7/y;->i0(Ld7/y;Lcom/google/protobuf/t1;)V

    return-object p0
.end method

.method public K(Lcom/google/protobuf/i;)Ld7/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/y;

    invoke-static {v0, p1}, Ld7/y;->h0(Ld7/y;Lcom/google/protobuf/i;)V

    return-object p0
.end method

.method public L(I)Ld7/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/y;

    invoke-static {v0, p1}, Ld7/y;->j0(Ld7/y;I)V

    return-object p0
.end method
