.class public final Lg5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lt5/c0$b;


# direct methods
.method private constructor <init>(Lt5/c0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/n;->a:Lt5/c0$b;

    return-void
.end method

.method private declared-synchronized c(Lt5/y;Lt5/i0;)Lt5/c0$c;
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-direct {p0}, Lg5/n;->g()I

    move-result v0

    sget-object v1, Lt5/i0;->k:Lt5/i0;

    if-eq p2, v1, :cond_0

    invoke-static {}, Lt5/c0$c;->X()Lt5/c0$c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lt5/c0$c$a;->B(Lt5/y;)Lt5/c0$c$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lt5/c0$c$a;->C(I)Lt5/c0$c$a;

    move-result-object p1

    sget-object v0, Lt5/z;->l:Lt5/z;

    invoke-virtual {p1, v0}, Lt5/c0$c$a;->E(Lt5/z;)Lt5/c0$c$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lt5/c0$c$a;->D(Lt5/i0;)Lt5/c0$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/c0$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "unknown output prefix type"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized e(I)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v0}, Lt5/c0$b;->E()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt5/c0$c;

    invoke-virtual {v1}, Lt5/c0$c;->T()I

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized f(Lt5/a0;)Lt5/c0$c;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lg5/w;->j(Lt5/a0;)Lt5/y;

    move-result-object v0

    invoke-virtual {p1}, Lt5/a0;->S()Lt5/i0;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lg5/n;->c(Lt5/y;Lt5/i0;)Lt5/c0$c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized g()I
    .locals 2

    monitor-enter p0

    :goto_0
    :try_start_0
    invoke-static {}, Lo5/q;->b()I

    move-result v0

    invoke-direct {p0, v0}, Lg5/n;->e(I)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static i()Lg5/n;
    .locals 2

    new-instance v0, Lg5/n;

    invoke-static {}, Lt5/c0;->W()Lt5/c0$b;

    move-result-object v1

    invoke-direct {v0, v1}, Lg5/n;-><init>(Lt5/c0$b;)V

    return-object v0
.end method

.method public static j(Lg5/m;)Lg5/n;
    .locals 1

    new-instance v0, Lg5/n;

    invoke-virtual {p0}, Lg5/m;->f()Lt5/c0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;->M()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object p0

    check-cast p0, Lt5/c0$b;

    invoke-direct {v0, p0}, Lg5/n;-><init>(Lt5/c0$b;)V

    return-object v0
.end method


# virtual methods
.method public declared-synchronized a(Lg5/k;)Lg5/n;
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lg5/k;->b()Lt5/a0;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lg5/n;->b(Lt5/a0;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Lt5/a0;Z)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p1}, Lg5/n;->f(Lt5/a0;)Lt5/c0$c;

    move-result-object p1

    iget-object v0, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v0, p1}, Lt5/c0$b;->B(Lt5/c0$c;)Lt5/c0$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {p1}, Lt5/c0$c;->T()I

    move-result v0

    invoke-virtual {p2, v0}, Lt5/c0$b;->F(I)Lt5/c0$b;

    :cond_0
    invoke-virtual {p1}, Lt5/c0$c;->T()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d()Lg5/m;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v0

    check-cast v0, Lt5/c0;

    invoke-static {v0}, Lg5/m;->e(Lt5/c0;)Lg5/m;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h(I)Lg5/n;
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v1}, Lt5/c0$b;->D()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v1, v0}, Lt5/c0$b;->C(I)Lt5/c0$c;

    move-result-object v1

    invoke-virtual {v1}, Lt5/c0$c;->T()I

    move-result v2

    if-ne v2, p1, :cond_1

    invoke-virtual {v1}, Lt5/c0$c;->V()Lt5/z;

    move-result-object v0

    sget-object v1, Lt5/z;->l:Lt5/z;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg5/n;->a:Lt5/c0$b;

    invoke-virtual {v0, p1}, Lt5/c0$b;->F(I)Lt5/c0$b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot set key as primary because it\'s not enabled: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "key not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
