.class public final Ln5/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lg5/o;

.field private b:Lg5/p;

.field private c:Ljava/lang/String;

.field private d:Lg5/a;

.field private e:Z

.field private f:Lg5/k;

.field private g:Ljava/security/KeyStore;

.field private h:Lg5/n;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln5/a$b;->a:Lg5/o;

    iput-object v0, p0, Ln5/a$b;->b:Lg5/p;

    iput-object v0, p0, Ln5/a$b;->c:Ljava/lang/String;

    iput-object v0, p0, Ln5/a$b;->d:Lg5/a;

    const/4 v1, 0x1

    iput-boolean v1, p0, Ln5/a$b;->e:Z

    iput-object v0, p0, Ln5/a$b;->f:Lg5/k;

    iput-object v0, p0, Ln5/a$b;->g:Ljava/security/KeyStore;

    return-void
.end method

.method static synthetic a(Ln5/a$b;)Lg5/p;
    .locals 0

    iget-object p0, p0, Ln5/a$b;->b:Lg5/p;

    return-object p0
.end method

.method static synthetic b(Ln5/a$b;)Lg5/a;
    .locals 0

    iget-object p0, p0, Ln5/a$b;->d:Lg5/a;

    return-object p0
.end method

.method static synthetic c(Ln5/a$b;)Lg5/n;
    .locals 0

    iget-object p0, p0, Ln5/a$b;->h:Lg5/n;

    return-object p0
.end method

.method private e()Lg5/n;
    .locals 3

    iget-object v0, p0, Ln5/a$b;->d:Lg5/a;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Ln5/a$b;->a:Lg5/o;

    invoke-static {v1, v0}, Lg5/m;->j(Lg5/o;Lg5/a;)Lg5/m;

    move-result-object v0

    invoke-static {v0}, Lg5/n;->j(Lg5/m;)Lg5/n;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/crypto/tink/shaded/protobuf/c0; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    :goto_0
    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "cannot decrypt keyset: "

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, Ln5/a$b;->a:Lg5/o;

    invoke-static {v0}, Lg5/b;->a(Lg5/o;)Lg5/m;

    move-result-object v0

    invoke-static {v0}, Lg5/n;->j(Lg5/m;)Lg5/n;

    move-result-object v0

    return-object v0
.end method

.method private f()Lg5/n;
    .locals 4

    :try_start_0
    invoke-direct {p0}, Ln5/a$b;->e()Lg5/n;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "keyset not found, will generate a new one. %s"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, Ln5/a$b;->f:Lg5/k;

    if-eqz v0, :cond_2

    invoke-static {}, Lg5/n;->i()Lg5/n;

    move-result-object v0

    iget-object v1, p0, Ln5/a$b;->f:Lg5/k;

    invoke-virtual {v0, v1}, Lg5/n;->a(Lg5/k;)Lg5/n;

    move-result-object v0

    invoke-virtual {v0}, Lg5/n;->d()Lg5/m;

    move-result-object v1

    invoke-virtual {v1}, Lg5/m;->g()Lt5/d0;

    move-result-object v1

    invoke-virtual {v1, v2}, Lt5/d0;->S(I)Lt5/d0$c;

    move-result-object v1

    invoke-virtual {v1}, Lt5/d0$c;->S()I

    move-result v1

    invoke-virtual {v0, v1}, Lg5/n;->h(I)Lg5/n;

    move-result-object v0

    iget-object v1, p0, Ln5/a$b;->d:Lg5/a;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lg5/n;->d()Lg5/m;

    move-result-object v1

    iget-object v2, p0, Ln5/a$b;->b:Lg5/p;

    iget-object v3, p0, Ln5/a$b;->d:Lg5/a;

    invoke-virtual {v1, v2, v3}, Lg5/m;->l(Lg5/p;Lg5/a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lg5/n;->d()Lg5/m;

    move-result-object v1

    iget-object v2, p0, Ln5/a$b;->b:Lg5/p;

    invoke-static {v1, v2}, Lg5/b;->b(Lg5/m;Lg5/p;)V

    :goto_0
    return-object v0

    :cond_2
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cannot read or generate keyset"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private g()Lg5/a;
    .locals 5

    invoke-static {}, Ln5/a;->a()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Android Keystore requires at least Android M"

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    iget-object v0, p0, Ln5/a$b;->g:Ljava/security/KeyStore;

    if-eqz v0, :cond_1

    new-instance v0, Ln5/c$b;

    invoke-direct {v0}, Ln5/c$b;-><init>()V

    iget-object v2, p0, Ln5/a$b;->g:Ljava/security/KeyStore;

    invoke-virtual {v0, v2}, Ln5/c$b;->b(Ljava/security/KeyStore;)Ln5/c$b;

    move-result-object v0

    invoke-virtual {v0}, Ln5/c$b;->a()Ln5/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ln5/c;

    invoke-direct {v0}, Ln5/c;-><init>()V

    :goto_0
    iget-object v2, p0, Ln5/a$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ln5/c;->e(Ljava/lang/String;)Z

    move-result v2

    const-string v3, "cannot use Android Keystore, it\'ll be disabled"

    if-nez v2, :cond_2

    :try_start_0
    iget-object v4, p0, Ln5/a$b;->c:Ljava/lang/String;

    invoke-static {v4}, Ln5/c;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :cond_2
    :goto_2
    :try_start_1
    iget-object v4, p0, Ln5/a$b;->c:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ln5/c;->a(Ljava/lang/String;)Lg5/a;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    :goto_3
    if-nez v2, :cond_3

    invoke-static {}, Ln5/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v1

    :cond_3
    new-instance v1, Ljava/security/KeyStoreException;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Ln5/a$b;->c:Ljava/lang/String;

    aput-object v4, v2, v3

    const-string v3, "the master key %s exists but is unusable"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/security/KeyStoreException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method


# virtual methods
.method public declared-synchronized d()Ln5/a;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ln5/a$b;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Ln5/a$b;->g()Lg5/a;

    move-result-object v0

    iput-object v0, p0, Ln5/a$b;->d:Lg5/a;

    :cond_0
    invoke-direct {p0}, Ln5/a$b;->f()Lg5/n;

    move-result-object v0

    iput-object v0, p0, Ln5/a$b;->h:Lg5/n;

    new-instance v0, Ln5/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln5/a;-><init>(Ln5/a$b;Ln5/a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public h(Lg5/k;)Ln5/a$b;
    .locals 0

    iput-object p1, p0, Ln5/a$b;->f:Lg5/k;

    return-object p0
.end method

.method public i(Ljava/lang/String;)Ln5/a$b;
    .locals 1

    const-string v0, "android-keystore://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ln5/a$b;->e:Z

    if-eqz v0, :cond_0

    iput-object p1, p0, Ln5/a$b;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "cannot call withMasterKeyUri() after calling doNotUseKeystore()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "key URI must start with android-keystore://"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ln5/a$b;
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    new-instance v0, Ln5/d;

    invoke-direct {v0, p1, p2, p3}, Ln5/d;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ln5/a$b;->a:Lg5/o;

    new-instance v0, Ln5/e;

    invoke-direct {v0, p1, p2, p3}, Ln5/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Ln5/a$b;->b:Lg5/p;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need a keyset name"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "need an Android context"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
