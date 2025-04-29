.class public final Ld7/n$c$a;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/n$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/n$c;",
        "Ld7/n$c$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/n$c;->e0()Ld7/n$c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/n$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/n$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ld7/b$b;)Ld7/n$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/n$c;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/b;

    invoke-static {v0, p1}, Ld7/n$c;->f0(Ld7/n$c;Ld7/b;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;)Ld7/n$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/n$c;

    invoke-static {v0, p1}, Ld7/n$c;->g0(Ld7/n$c;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Ld7/b0;)Ld7/n$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/n$c;

    invoke-static {v0, p1}, Ld7/n$c;->j0(Ld7/n$c;Ld7/b0;)V

    return-object p0
.end method

.method public K(Ld7/b$b;)Ld7/n$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/n$c;

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/b;

    invoke-static {v0, p1}, Ld7/n$c;->h0(Ld7/n$c;Ld7/b;)V

    return-object p0
.end method

.method public L(Ld7/n$c$b;)Ld7/n$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/n$c;

    invoke-static {v0, p1}, Ld7/n$c;->i0(Ld7/n$c;Ld7/n$c$b;)V

    return-object p0
.end method
