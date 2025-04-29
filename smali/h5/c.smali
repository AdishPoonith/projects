.class public final Lh5/c;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/d;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 4

    const-class v0, Lt5/d;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lh5/c$a;

    const-class v3, Lg5/a;

    invoke-direct {v2, v3}, Lh5/c$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh5/c;->l(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static l(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII",
            "Lt5/u;",
            "Lg5/k$b;",
            ")",
            "Lo5/d$a$a<",
            "Lt5/e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo5/d$a$a;

    invoke-static {p0, p1, p2, p3, p4}, Lh5/c;->m(IIIILt5/u;)Lt5/e;

    move-result-object p0

    invoke-direct {v0, p0, p5}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    return-object v0
.end method

.method private static m(IIIILt5/u;)Lt5/e;
    .locals 2

    invoke-static {}, Lt5/g;->T()Lt5/g$b;

    move-result-object v0

    invoke-static {}, Lt5/h;->R()Lt5/h$b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lt5/h$b;->B(I)Lt5/h$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/h;

    invoke-virtual {v0, p1}, Lt5/g$b;->C(Lt5/h;)Lt5/g$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lt5/g$b;->B(I)Lt5/g$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/g;

    invoke-static {}, Lt5/w;->T()Lt5/w$b;

    move-result-object p1

    invoke-static {}, Lt5/x;->T()Lt5/x$b;

    move-result-object v0

    invoke-virtual {v0, p4}, Lt5/x$b;->B(Lt5/u;)Lt5/x$b;

    move-result-object p4

    invoke-virtual {p4, p3}, Lt5/x$b;->C(I)Lt5/x$b;

    move-result-object p3

    invoke-virtual {p3}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p3

    check-cast p3, Lt5/x;

    invoke-virtual {p1, p3}, Lt5/w$b;->C(Lt5/x;)Lt5/w$b;

    move-result-object p1

    invoke-virtual {p1, p2}, Lt5/w$b;->B(I)Lt5/w$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/w;

    invoke-static {}, Lt5/e;->S()Lt5/e$b;

    move-result-object p2

    invoke-virtual {p2, p0}, Lt5/e$b;->B(Lt5/g;)Lt5/e$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lt5/e$b;->C(Lt5/w;)Lt5/e$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/e;

    return-object p0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lh5/c;

    invoke-direct {v0}, Lh5/c;-><init>()V

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

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/e;",
            "Lt5/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lh5/c$b;

    const-class v1, Lt5/e;

    invoke-direct {v0, p0, v1}, Lh5/c$b;-><init>(Lh5/c;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/c;->o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/d;

    invoke-virtual {p0, p1}, Lh5/c;->q(Lt5/d;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/d;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/d;->V(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/d;

    move-result-object p1

    return-object p1
.end method

.method public q(Lt5/d;)V
    .locals 2

    invoke-virtual {p1}, Lt5/d;->T()I

    move-result v0

    invoke-virtual {p0}, Lh5/c;->n()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    new-instance v0, Lh5/d;

    invoke-direct {v0}, Lh5/d;-><init>()V

    invoke-virtual {p1}, Lt5/d;->R()Lt5/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh5/d;->n(Lt5/f;)V

    new-instance v0, Lp5/i;

    invoke-direct {v0}, Lp5/i;-><init>()V

    invoke-virtual {p1}, Lt5/d;->S()Lt5/v;

    move-result-object p1

    invoke-virtual {v0, p1}, Lp5/i;->q(Lt5/v;)V

    return-void
.end method
