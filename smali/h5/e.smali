.class public final Lh5/e;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/i;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/i;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/e$a;

    const-class v3, Lg5/a;

    invoke-direct {v2, v3}, Lh5/e$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(IILg5/k$b;)Lo5/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2}, Lh5/e;->l(IILg5/k$b;)Lo5/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IILg5/k$b;)Lo5/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lg5/k$b;",
            ")",
            "Lo5/d$a$a<",
            "Lt5/j;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lt5/j;->S()Lt5/j$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lt5/j$b;->B(I)Lt5/j$b;

    move-result-object p0

    invoke-static {}, Lt5/k;->R()Lt5/k$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt5/k$b;->B(I)Lt5/k$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/k;

    invoke-virtual {p0, p1}, Lt5/j$b;->C(Lt5/k;)Lt5/j$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/j;

    new-instance p1, Lo5/d$a$a;

    invoke-direct {p1, p0, p2}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    return-object p1
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lh5/e;

    invoke-direct {v0}, Lh5/e;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/j;",
            "Lt5/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/e$b;

    const-class v1, Lt5/j;

    invoke-direct {v0, p0, v1}, Lh5/e$b;-><init>(Lh5/e;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/e;->n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/i;

    invoke-virtual {p0, p1}, Lh5/e;->p(Lt5/i;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/i;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/i;->V(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/i;

    move-result-object p1

    return-object p1
.end method

.method public p(Lt5/i;)V
    .locals 2

    invoke-virtual {p1}, Lt5/i;->T()I

    move-result v0

    invoke-virtual {p0}, Lh5/e;->m()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/i;->R()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    invoke-static {v0}, Lu5/r;->a(I)V

    invoke-virtual {p1}, Lt5/i;->S()Lt5/k;

    move-result-object v0

    invoke-virtual {v0}, Lt5/k;->Q()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lt5/i;->S()Lt5/k;

    move-result-object p1

    invoke-virtual {p1}, Lt5/k;->Q()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
