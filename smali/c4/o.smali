.class public Lc4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field private static final b:Lc4/j;

.field private static final c:Lc4/o;


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc4/j;

    const-string v1, "LibraryVersion"

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lc4/j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lc4/o;->b:Lc4/j;

    new-instance v0, Lc4/o;

    invoke-direct {v0}, Lc4/o;-><init>()V

    sput-object v0, Lc4/o;->c:Lc4/o;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lc4/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static a()Lc4/o;
    .locals 1

    sget-object v0, Lc4/o;->c:Lc4/o;

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Failed to get app version for libraryName: "

    const-string v1, "LibraryVersion"

    const-string v2, "Please provide a valid libraryName"

    invoke-static {p1, v2}, Lc4/s;->g(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    iget-object v2, p0, Lc4/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lc4/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V

    const/4 v3, 0x0

    :try_start_0
    const-string v4, "/%s.properties"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-class v5, Lc4/o;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v4, :cond_1

    :try_start_1
    invoke-virtual {v2, v4}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    const-string v5, "version"

    invoke-virtual {v2, v5, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v2, Lc4/o;->b:Lc4/j;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " version is "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Lc4/j;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v2, Lc4/o;->b:Lc4/j;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v5}, Lc4/j;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v4, :cond_3

    invoke-static {v4}, Lh4/i;->a(Ljava/io/Closeable;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v3, v4

    goto :goto_3

    :catch_0
    move-exception v2

    move-object v7, v4

    move-object v4, v3

    move-object v3, v7

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception v2

    move-object v4, v3

    :goto_1
    :try_start_2
    sget-object v5, Lc4/o;->b:Lc4/j;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v1, v0, v2}, Lc4/j;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_2

    invoke-static {v3}, Lh4/i;->a(Ljava/io/Closeable;)V

    :cond_2
    move-object v3, v4

    :cond_3
    :goto_2
    if-nez v3, :cond_4

    sget-object v0, Lc4/o;->b:Lc4/j;

    const-string v2, ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"

    invoke-virtual {v0, v1, v2}, Lc4/j;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "UNKNOWN"

    :cond_4
    iget-object v0, p0, Lc4/o;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3

    :goto_3
    if-eqz v3, :cond_5

    invoke-static {v3}, Lh4/i;->a(Ljava/io/Closeable;)V

    :cond_5
    throw p1
.end method
