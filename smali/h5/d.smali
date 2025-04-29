.class public Lh5/d;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/f;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/f;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/d$a;

    const-class v3, Lu5/l;

    invoke-direct {v2, v3}, Lh5/d$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(Lh5/d;Lt5/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lh5/d;->o(Lt5/h;)V

    return-void
.end method

.method private o(Lt5/h;)V
    .locals 2

    invoke-virtual {p1}, Lt5/h;->Q()I

    move-result v0

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lt5/h;->Q()I

    move-result p1

    const/16 v0, 0x10

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/g;",
            "Lt5/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/d$b;

    const-class v1, Lt5/g;

    invoke-direct {v0, p0, v1}, Lh5/d$b;-><init>(Lh5/d;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/d;->m(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/f;

    invoke-virtual {p0, p1}, Lh5/d;->n(Lt5/f;)V

    return-void
.end method

.method public l()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/f;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/f;->W(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/f;

    move-result-object p1

    return-object p1
.end method

.method public n(Lt5/f;)V
    .locals 2

    invoke-virtual {p1}, Lt5/f;->U()I

    move-result v0

    invoke-virtual {p0}, Lh5/d;->l()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/f;->S()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    invoke-static {v0}, Lu5/r;->a(I)V

    invoke-virtual {p1}, Lt5/f;->T()Lt5/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lh5/d;->o(Lt5/h;)V

    return-void
.end method
