.class public final Lg5/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt5/c0;

.field private final b:Lr5/a;


# direct methods
.method private constructor <init>(Lt5/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/m;->a:Lt5/c0;

    sget-object p1, Lr5/a;->b:Lr5/a;

    iput-object p1, p0, Lg5/m;->b:Lr5/a;

    return-void
.end method

.method private static a(Lt5/t;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lt5/t;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->size()I

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static b(Lt5/c0;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lt5/c0;->T()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static c(Lt5/t;Lg5/a;[B)Lt5/c0;
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Lt5/t;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lg5/a;->b([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object p1

    invoke-static {p0, p1}, Lt5/c0;->X([BLcom/google/crypto/tink/shaded/protobuf/q;)Lt5/c0;

    move-result-object p0

    invoke-static {p0}, Lg5/m;->b(Lt5/c0;)V
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static d(Lt5/c0;Lg5/a;[B)Lt5/t;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/a;->f()[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Lg5/a;->a([B[B)[B

    move-result-object v0

    :try_start_0
    invoke-interface {p1, v0, p2}, Lg5/a;->b([B[B)[B

    move-result-object p1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object p2

    invoke-static {p1, p2}, Lt5/c0;->X([BLcom/google/crypto/tink/shaded/protobuf/q;)Lt5/c0;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    invoke-static {}, Lt5/t;->R()Lt5/t$b;

    move-result-object p1

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p2

    invoke-virtual {p1, p2}, Lt5/t$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/t$b;

    move-result-object p1

    invoke-static {p0}, Lg5/y;->b(Lt5/c0;)Lt5/d0;

    move-result-object p0

    invoke-virtual {p1, p0}, Lt5/t$b;->C(Lt5/d0;)Lt5/t$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/t;

    return-object p0

    :cond_0
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "cannot encrypt keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_1
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static final e(Lt5/c0;)Lg5/m;
    .locals 1

    invoke-static {p0}, Lg5/m;->b(Lt5/c0;)V

    new-instance v0, Lg5/m;

    invoke-direct {v0, p0}, Lg5/m;-><init>(Lt5/c0;)V

    return-object v0
.end method

.method private i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<B:",
            "Ljava/lang/Object;",
            "P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;",
            "Ljava/lang/Class<",
            "TB;>;)TP;"
        }
    .end annotation

    iget-object v0, p0, Lg5/m;->a:Lt5/c0;

    invoke-static {v0}, Lg5/y;->d(Lt5/c0;)V

    invoke-static {p2}, Lg5/u;->j(Ljava/lang/Class;)Lg5/u$b;

    move-result-object v0

    iget-object v1, p0, Lg5/m;->b:Lr5/a;

    invoke-virtual {v0, v1}, Lg5/u$b;->e(Lr5/a;)Lg5/u$b;

    iget-object v1, p0, Lg5/m;->a:Lt5/c0;

    invoke-virtual {v1}, Lt5/c0;->U()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt5/c0$c;

    invoke-virtual {v2}, Lt5/c0$c;->V()Lt5/z;

    move-result-object v3

    sget-object v4, Lt5/z;->l:Lt5/z;

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lt5/c0$c;->S()Lt5/y;

    move-result-object v3

    invoke-static {v3, p2}, Lg5/w;->f(Lt5/y;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2}, Lt5/c0$c;->T()I

    move-result v4

    iget-object v5, p0, Lg5/m;->a:Lt5/c0;

    invoke-virtual {v5}, Lt5/c0;->V()I

    move-result v5

    if-ne v4, v5, :cond_1

    invoke-virtual {v0, v3, v2}, Lg5/u$b;->a(Ljava/lang/Object;Lt5/c0$c;)Lg5/u$b;

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3, v2}, Lg5/u$b;->b(Ljava/lang/Object;Lt5/c0$c;)Lg5/u$b;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lg5/u$b;->d()Lg5/u;

    move-result-object p2

    invoke-static {p2, p1}, Lg5/w;->n(Lg5/u;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public static final j(Lg5/o;Lg5/a;)Lg5/m;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {p0, p1, v0}, Lg5/m;->k(Lg5/o;Lg5/a;[B)Lg5/m;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lg5/o;Lg5/a;[B)Lg5/m;
    .locals 1

    invoke-interface {p0}, Lg5/o;->a()Lt5/t;

    move-result-object p0

    invoke-static {p0}, Lg5/m;->a(Lt5/t;)V

    new-instance v0, Lg5/m;

    invoke-static {p0, p1, p2}, Lg5/m;->c(Lt5/t;Lg5/a;[B)Lt5/c0;

    move-result-object p0

    invoke-direct {v0, p0}, Lg5/m;-><init>(Lt5/c0;)V

    return-object v0
.end method


# virtual methods
.method f()Lt5/c0;
    .locals 1

    iget-object v0, p0, Lg5/m;->a:Lt5/c0;

    return-object v0
.end method

.method public g()Lt5/d0;
    .locals 1

    iget-object v0, p0, Lg5/m;->a:Lt5/c0;

    invoke-static {v0}, Lg5/y;->b(Lt5/c0;)Lt5/d0;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<P:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TP;>;)TP;"
        }
    .end annotation

    invoke-static {p1}, Lg5/w;->c(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, v0}, Lg5/m;->i(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No wrapper found for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public l(Lg5/p;Lg5/a;)V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0, p1, p2, v0}, Lg5/m;->m(Lg5/p;Lg5/a;[B)V

    return-void
.end method

.method public m(Lg5/p;Lg5/a;[B)V
    .locals 1

    iget-object v0, p0, Lg5/m;->a:Lt5/c0;

    invoke-static {v0, p2, p3}, Lg5/m;->d(Lt5/c0;Lg5/a;[B)Lt5/t;

    move-result-object p2

    invoke-interface {p1, p2}, Lg5/p;->b(Lt5/t;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lg5/m;->g()Lt5/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
