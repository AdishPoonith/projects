.class final Lcom/google/android/gms/internal/firebase-auth-api/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/i7;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

.field private b:I

.field private c:I

.field private d:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/s4;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/x5;->d:[B

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    iput-object p0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c:Lcom/google/android/gms/internal/firebase-auth-api/t4;

    return-void
.end method

.method private final f(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    ushr-int/lit8 v1, v1, 0x3

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v1, v1, 0x4

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    :try_start_0
    invoke-interface {p2, p1, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->c(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/i7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    iget p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p1, p2, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->g()Lcom/google/android/gms/internal/firebase-auth-api/z5;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    throw p1
.end method

.method private final g(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    iget v2, v1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a:I

    iget v3, v1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b:I

    if-ge v2, v3, :cond_0

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->k(I)I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    iget v2, v1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a:I

    invoke-interface {p2, p1, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->c(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/i7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->A(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    iget p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p1, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->a(I)V

    return-void

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/z5;

    const-string p2, "Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit."

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/z5;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->j()Lcom/google/android/gms/internal/firebase-auth-api/z5;

    move-result-object p1

    throw p1
.end method

.method private final i(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1
.end method

.method private static final j(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x3

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->g()Lcom/google/android/gms/internal/firebase-auth-api/z5;

    move-result-object p0

    throw p0
.end method

.method private static final k(I)V
    .locals 0

    and-int/lit8 p0, p0, 0x7

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->g()Lcom/google/android/gms/internal/firebase-auth-api/z5;

    move-result-object p0

    throw p0
.end method

.method public static l(Lcom/google/android/gms/internal/firebase-auth-api/s4;)Lcom/google/android/gms/internal/firebase-auth-api/t4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c:Lcom/google/android/gms/internal/firebase-auth-api/t4;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/t4;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/s4;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->f(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    return-void
.end method

.method public final b(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x2

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->zze()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->zzf(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1
.end method

.method public final c(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->g(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    return-void
.end method

.method public final d(Ljava/util/List;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v1, v0, 0x7

    const/4 v2, 0x3

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-interface {p2}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->zze()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->f(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/j7;Lcom/google/android/gms/internal/firebase-auth-api/e5;)V

    invoke-interface {p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/j7;->zzf(Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v1

    if-eq v1, v0, :cond_0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    :cond_2
    :goto_0
    return-void

    :cond_3
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1
.end method

.method public final e(Ljava/util/List;Z)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_6

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/d6;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/d6;

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/d6;->n(Lcom/google/android/gms/internal/firebase-auth-api/m4;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, p2, :cond_1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_3
    :goto_0
    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->zzs()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->zzr()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_3

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1
.end method

.method public final zzA(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->s()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->s()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->s()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->s()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzB(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/m5;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/m5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->i()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/m5;->e(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->i()F

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/m5;->e(F)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final zzD(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->n()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzE(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->t()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->t()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->t()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->t()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzG(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->o()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->o()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method

.method public final zzH(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->u()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->u()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->u()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->u()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzI(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->p()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->p()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzJ(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->v()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->v()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->v()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzL(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzM(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/l6;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->w()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->w()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l6;->k(J)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->w()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->w()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzN()Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c()Z

    move-result v0

    return v0
.end method

.method public final zzO()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->d(I)Z

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zza()D
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->h()D

    move-result-wide v0

    return-wide v0
.end method

.method public final zzb()F
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->i()F

    move-result v0

    return v0
.end method

.method public final zzc()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    if-eqz v0, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    :goto_0
    if-eqz v0, :cond_2

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->c:I

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    ushr-int/lit8 v0, v0, 0x3

    return v0

    :cond_2
    :goto_1
    const v0, 0x7fffffff

    return v0
.end method

.method public final zzd()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    return v0
.end method

.method public final zze()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->l()I

    move-result v0

    return v0
.end method

.method public final zzf()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->m()I

    move-result v0

    return v0
.end method

.method public final zzg()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->n()I

    move-result v0

    return v0
.end method

.method public final zzh()I
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->o()I

    move-result v0

    return v0
.end method

.method public final zzi()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->p()I

    move-result v0

    return v0
.end method

.method public final zzj()I
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    return v0
.end method

.method public final zzk()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->s()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzl()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->t()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzm()J
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->u()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzn()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->v()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzo()J
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->w()J

    move-result-wide v0

    return-wide v0
.end method

.method public final zzp()Lcom/google/android/gms/internal/firebase-auth-api/m4;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->x()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    return-object v0
.end method

.method public final zzr()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzs()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->i(I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zzv(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/a4;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/a4;->e(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/a4;->e(Z)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzw(Ljava/util/List;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->zzp()Lcom/google/android/gms/internal/firebase-auth-api/m4;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1
.end method

.method public final zzx(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/b5;

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/b5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->h()D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/b5;->e(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->h()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/b5;->e(D)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->h()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    :goto_0
    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->h()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzy(Ljava/util/List;)V
    .locals 2

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x2

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eqz p1, :cond_2

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, p1

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v1, :cond_0

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->l()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eqz v0, :cond_7

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_5

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->h(I)V

    return-void

    :cond_6
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->l()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_7

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void
.end method

.method public final zzz(Ljava/util/List;)V
    .locals 4

    instance-of v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    const/4 v1, 0x5

    const/4 v2, 0x2

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/s5;

    iget p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 p1, p1, 0x7

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq p1, v1, :cond_0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_2
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int v3, v1, p1

    :cond_4
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->m()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s5;->k(I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result p1

    if-lt p1, v3, :cond_4

    goto :goto_0

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    and-int/lit8 v0, v0, 0x7

    if-eq v0, v2, :cond_9

    if-ne v0, v1, :cond_8

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    return-void

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->q()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->b:I

    if-eq v0, v1, :cond_6

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->d:I

    return-void

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a()Lcom/google/android/gms/internal/firebase-auth-api/y5;

    move-result-object p1

    throw p1

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->r()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->j(I)V

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v1

    add-int/2addr v1, v0

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->m()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;->a:Lcom/google/android/gms/internal/firebase-auth-api/s4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s4;->j()I

    move-result v0

    if-lt v0, v1, :cond_a

    :goto_0
    return-void
.end method
