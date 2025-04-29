.class public final Lp5/i;
.super Lo5/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d<",
        "Lt5/v;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 4

    const-class v0, Lt5/v;

    const/4 v1, 0x1

    new-array v1, v1, [Lo5/k;

    new-instance v2, Lp5/i$a;

    const-class v3, Lg5/s;

    invoke-direct {v2, v3}, Lp5/i$a;-><init>(Ljava/lang/Class;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-direct {p0, v0, v1}, Lo5/d;-><init>(Ljava/lang/Class;[Lo5/k;)V

    return-void
.end method

.method static synthetic k(Lt5/x;)V
    .locals 0

    invoke-static {p0}, Lp5/i;->r(Lt5/x;)V

    return-void
.end method

.method static synthetic l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp5/i;->m(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object p0

    return-object p0
.end method

.method private static m(IILt5/u;Lg5/k$b;)Lo5/d$a$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lt5/u;",
            "Lg5/k$b;",
            ")",
            "Lo5/d$a$a<",
            "Lt5/w;",
            ">;"
        }
    .end annotation

    new-instance v0, Lo5/d$a$a;

    invoke-static {}, Lt5/w;->T()Lt5/w$b;

    move-result-object v1

    invoke-static {}, Lt5/x;->T()Lt5/x$b;

    move-result-object v2

    invoke-virtual {v2, p2}, Lt5/x$b;->B(Lt5/u;)Lt5/x$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lt5/x$b;->C(I)Lt5/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/x;

    invoke-virtual {v1, p1}, Lt5/w$b;->C(Lt5/x;)Lt5/w$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lt5/w$b;->B(I)Lt5/w$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/w;

    invoke-direct {v0, p0, p3}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    return-object v0
.end method

.method public static p(Z)V
    .locals 1

    new-instance v0, Lp5/i;

    invoke-direct {v0}, Lp5/i;-><init>()V

    invoke-static {v0, p0}, Lg5/w;->k(Lo5/d;Z)V

    return-void
.end method

.method private static r(Lt5/x;)V
    .locals 3

    invoke-virtual {p0}, Lt5/x;->S()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    sget-object v0, Lp5/i$c;->a:[I

    invoke-virtual {p0}, Lt5/x;->R()Lt5/u;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lt5/x;->S()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lt5/x;->S()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Lt5/x;->S()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lt5/x;->S()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Lt5/x;->S()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a()Ll5/b$b;
    .locals 1

    sget-object v0, Ll5/b$b;->k:Ll5/b$b;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public f()Lo5/d$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/d$a<",
            "Lt5/w;",
            "Lt5/v;",
            ">;"
        }
    .end annotation

    new-instance v0, Lp5/i$b;

    const-class v1, Lt5/w;

    invoke-direct {v0, p0, v1}, Lp5/i$b;-><init>(Lp5/i;Ljava/lang/Class;)V

    return-object v0
.end method

.method public g()Lt5/y$c;
    .locals 1

    sget-object v0, Lt5/y$c;->l:Lt5/y$c;

    return-object v0
.end method

.method public bridge synthetic h(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lp5/i;->o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/v;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/v;

    invoke-virtual {p0, p1}, Lp5/i;->q(Lt5/v;)V

    return-void
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/v;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/v;->W(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/v;

    move-result-object p1

    return-object p1
.end method

.method public q(Lt5/v;)V
    .locals 2

    invoke-virtual {p1}, Lt5/v;->U()I

    move-result v0

    invoke-virtual {p0}, Lp5/i;->n()I

    move-result v1

    invoke-static {v0, v1}, Lu5/r;->c(II)V

    invoke-virtual {p1}, Lt5/v;->S()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lt5/v;->T()Lt5/x;

    move-result-object p1

    invoke-static {p1}, Lp5/i;->r(Lt5/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
