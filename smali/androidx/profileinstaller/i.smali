.class public Landroidx/profileinstaller/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/profileinstaller/i$c;
    }
.end annotation


# static fields
.field private static final a:Landroidx/profileinstaller/i$c;

.field static final b:Landroidx/profileinstaller/i$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/profileinstaller/i$a;

    invoke-direct {v0}, Landroidx/profileinstaller/i$a;-><init>()V

    sput-object v0, Landroidx/profileinstaller/i;->a:Landroidx/profileinstaller/i$c;

    new-instance v0, Landroidx/profileinstaller/i$b;

    invoke-direct {v0}, Landroidx/profileinstaller/i$b;-><init>()V

    sput-object v0, Landroidx/profileinstaller/i;->b:Landroidx/profileinstaller/i$c;

    return-void
.end method

.method public static synthetic a(Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/profileinstaller/i;->e(Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V

    return-void
.end method

.method static b(Ljava/io/File;)Z
    .locals 2

    new-instance v0, Ljava/io/File;

    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result p0

    return p0
.end method

.method static c(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Landroidx/profileinstaller/i;->b(Ljava/io/File;)Z

    const/16 p0, 0xb

    const/4 v0, 0x0

    invoke-static {p1, p2, p0, v0}, Landroidx/profileinstaller/i;->g(Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V

    return-void
.end method

.method static d(Landroid/content/pm/PackageInfo;Ljava/io/File;Landroidx/profileinstaller/i$c;)Z
    .locals 4

    new-instance v0, Ljava/io/File;

    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return v1

    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/DataInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/DataInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    iget-wide p0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    cmp-long v0, v2, p0

    if-nez v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-eqz v1, :cond_2

    const/4 p0, 0x2

    const/4 p1, 0x0

    invoke-interface {p2, p0, p1}, Landroidx/profileinstaller/i$c;->b(ILjava/lang/Object;)V

    :cond_2
    return v1

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {p1}, Ljava/io/DataInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    return v1
.end method

.method private static synthetic e(Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Landroidx/profileinstaller/i$c;->b(ILjava/lang/Object;)V

    return-void
.end method

.method static f(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    .locals 2

    new-instance v0, Ljava/io/File;

    const-string v1, "profileinstaller_profileWrittenFor_lastUpdateTime.dat"

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance p1, Ljava/io/DataOutputStream;

    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-wide v0, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {p1, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catchall_0
    move-exception p0

    :try_start_3
    invoke-virtual {p1}, Ljava/io/DataOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_1
    return-void
.end method

.method static g(Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V
    .locals 1

    new-instance v0, Landroidx/profileinstaller/h;

    invoke-direct {v0, p1, p2, p3}, Landroidx/profileinstaller/h;-><init>(Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static h(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/io/File;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)Z
    .locals 8

    new-instance v7, Ljava/io/File;

    new-instance v0, Ljava/io/File;

    const-string v1, "/data/misc/profiles/cur/0"

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "primary.prof"

    invoke-direct {v7, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Landroidx/profileinstaller/c;

    const-string v5, "dexopt/baseline.prof"

    const-string v6, "dexopt/baseline.profm"

    move-object v0, p1

    move-object v1, p0

    move-object v2, p5

    move-object v3, p6

    move-object v4, p4

    invoke-direct/range {v0 .. v7}, Landroidx/profileinstaller/c;-><init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V

    invoke-virtual {p1}, Landroidx/profileinstaller/c;->e()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-virtual {p1}, Landroidx/profileinstaller/c;->i()Landroidx/profileinstaller/c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/profileinstaller/c;->m()Landroidx/profileinstaller/c;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/profileinstaller/c;->n()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-static {p2, p3}, Landroidx/profileinstaller/i;->f(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    :cond_1
    return p0
.end method

.method public static i(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Landroidx/profileinstaller/g;->j:Landroidx/profileinstaller/g;

    sget-object v1, Landroidx/profileinstaller/i;->a:Landroidx/profileinstaller/i$c;

    invoke-static {p0, v0, v1}, Landroidx/profileinstaller/i;->j(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)V

    return-void
.end method

.method public static j(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Landroidx/profileinstaller/i;->k(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;Z)V

    return-void
.end method

.method static k(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;Z)V
    .locals 9

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v3, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual {v1, v2, v8}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v1, "ProfileInstaller"

    if-nez p3, :cond_2

    invoke-static {v3, v4, p2}, Landroidx/profileinstaller/i;->d(Landroid/content/pm/PackageInfo;Ljava/io/File;Landroidx/profileinstaller/i$c;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Skipping profile installation for "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    invoke-static {p0, v8}, Landroidx/profileinstaller/o;->c(Landroid/content/Context;Z)Landroidx/profileinstaller/o$c;

    goto :goto_2

    :cond_2
    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Installing profile for "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v0

    move-object v6, p1

    move-object v7, p2

    invoke-static/range {v1 .. v7}, Landroidx/profileinstaller/i;->h(Landroid/content/res/AssetManager;Ljava/lang/String;Landroid/content/pm/PackageInfo;Ljava/io/File;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p3, :cond_1

    const/4 v8, 0x1

    goto :goto_0

    :goto_2
    return-void

    :catch_0
    move-exception p1

    const/4 p3, 0x7

    invoke-interface {p2, p3, p1}, Landroidx/profileinstaller/i$c;->b(ILjava/lang/Object;)V

    invoke-static {p0, v8}, Landroidx/profileinstaller/o;->c(Landroid/content/Context;Z)Landroidx/profileinstaller/o$c;

    return-void
.end method

.method static l(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;)V
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-static {v0, p0}, Landroidx/profileinstaller/i;->f(Landroid/content/pm/PackageInfo;Ljava/io/File;)V

    const/16 p0, 0xa

    const/4 v0, 0x0

    invoke-static {p1, p2, p0, v0}, Landroidx/profileinstaller/i;->g(Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V

    return-void

    :catch_0
    move-exception p0

    const/4 v0, 0x7

    invoke-static {p1, p2, v0, p0}, Landroidx/profileinstaller/i;->g(Ljava/util/concurrent/Executor;Landroidx/profileinstaller/i$c;ILjava/lang/Object;)V

    return-void
.end method
