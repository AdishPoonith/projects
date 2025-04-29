.class public final Lp5/b;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/a;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lp5/b$a;

    const-class v3, Lg5/s;

    invoke-direct {v2, v3}, Lp5/b$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(Lt5/c;)V
    .locals 0

    invoke-static {p0}, Lp5/b;->q(Lt5/c;)V

    return-void
.end method

.method static synthetic l(I)V
    .locals 0

    invoke-static {p0}, Lp5/b;->r(I)V

    return-void
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lp5/b;

    invoke-direct {v0}, Lp5/b;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    invoke-static {}, Lp5/h;->d()V

    return-void
.end method

.method private static q(Lt5/c;)V
    .locals 2

    invoke-virtual {p0}, Lt5/c;->Q()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Lt5/c;->Q()I

    move-result p0

    const/16 v0, 0x10

    if-gt p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too long"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static r(I)V
    .locals 1

    const/16 v0, 0x20

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "AesCmacKey size wrong, must be 32 bytes"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCmacKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/b;",
            "Lt5/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp5/b$b;

    const-class v1, Lt5/b;

    invoke-direct {v0, p0, v1}, Lp5/b$b;-><init>(Lp5/b;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lp5/b;->n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/a;

    invoke-virtual {p0, p1}, Lp5/b;->p(Lt5/a;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/a;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/a;->V(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/a;

    move-result-object p1

    return-object p1
.end method

.method public p(Lt5/a;)V
    .locals 2

    invoke-virtual {p1}, Lt5/a;->T()I

    move-result v0

    invoke-virtual {p0}, Lp5/b;->m()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/a;->R()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    invoke-static {v0}, Lp5/b;->r(I)V

    invoke-virtual {p1}, Lt5/a;->S()Lt5/c;

    move-result-object p1

    invoke-static {p1}, Lp5/b;->q(Lt5/c;)V

    return-void
.end method
