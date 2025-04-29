.class public final Lh5/g;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/n;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/n;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/g$a;

    const-class v3, Lg5/a;

    invoke-direct {v2, v3}, Lh5/g$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(ILg5/k$b;)Lo5/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lh5/g;->m(ILg5/k$b;)Lo5/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method private static m(ILg5/k$b;)Lo5/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lg5/k$b;",
            ")",
            "Lo5/d$a$a<",
            "Lt5/o;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lt5/o;->Q()Lt5/o$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lt5/o$b;->B(I)Lt5/o$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/o;

    new-instance v0, Lo5/d$a$a;

    invoke-direct {v0, p0, p1}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    invoke-static {}, Lh5/g;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lh5/g;

    invoke-direct {v0}, Lh5/g;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/o;",
            "Lt5/n;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/g$b;

    const-class v1, Lt5/o;

    invoke-direct {v0, p0, v1}, Lh5/g$b;-><init>(Lh5/g;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/g;->o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/n;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/n;

    invoke-virtual {p0, p1}, Lh5/g;->q(Lt5/n;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/n;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/n;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/n;

    move-result-object p1

    return-object p1
.end method

.method public q(Lt5/n;)V
    .locals 2

    invoke-virtual {p1}, Lt5/n;->R()I

    move-result v0

    invoke-virtual {p0}, Lh5/g;->n()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/n;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    invoke-static {p1}, Lu5/r;->a(I)V

    return-void
.end method
