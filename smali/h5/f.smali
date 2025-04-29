.class public final Lh5/f;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/l;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/l;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/f$a;

    const-class v3, Lg5/a;

    invoke-direct {v2, v3}, Lh5/f$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(ILg5/k$b;)Lo5/d$a$a;
    .locals 0

    invoke-static {p0, p1}, Lh5/f;->l(ILg5/k$b;)Lo5/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(ILg5/k$b;)Lo5/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lg5/k$b;",
            ")",
            "Lo5/d$a$a<",
            "Lt5/m;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lt5/m;->Q()Lt5/m$b;

    move-result-object v0

    invoke-virtual {v0, p0}, Lt5/m$b;->B(I)Lt5/m$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/m;

    new-instance v0, Lo5/d$a$a;

    invoke-direct {v0, p0, p1}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    return-object v0
.end method

.method public static o(Z)V
    .locals 1

    new-instance v0, Lh5/f;

    invoke-direct {v0}, Lh5/f;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    return-void
.end method


# virtual methods
.method public a()Ll5/b$b;
    .locals 1

    sget-object v0, Ll5/b$b;->k:Ll5/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/m;",
            "Lt5/l;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/f$b;

    const-class v1, Lt5/m;

    invoke-direct {v0, p0, v1}, Lh5/f$b;-><init>(Lh5/f;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/f;->n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/l;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/l;

    invoke-virtual {p0, p1}, Lh5/f;->p(Lt5/l;)V

    return-void
.end method

.method public m()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/l;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/l;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/l;

    move-result-object p1

    return-object p1
.end method

.method public p(Lt5/l;)V
    .locals 2

    invoke-virtual {p1}, Lt5/l;->R()I

    move-result v0

    invoke-virtual {p0}, Lh5/f;->m()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/l;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p1

    invoke-static {p1}, Lu5/r;->a(I)V

    return-void
.end method
