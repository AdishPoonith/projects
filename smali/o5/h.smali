.class public final Lo5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Lo5/h;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lo5/o;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo5/h;

    invoke-direct {v0}, Lo5/h;-><init>()V

    sput-object v0, Lo5/h;->b:Lo5/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lo5/o$b;

    invoke-direct {v1}, Lo5/o$b;-><init>()V

    invoke-virtual {v1}, Lo5/o$b;->e()Lo5/o;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static a()Lo5/h;
    .locals 1

    sget-object v0, Lo5/h;->b:Lo5/h;

    return-object v0
.end method


# virtual methods
.method public b(Lo5/n;Lg5/x;)Lg5/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lo5/n;",
            ">(TSerializationT;",
            "Lg5/x;",
            ")",
            "Lg5/f;"
        }
    .end annotation

    iget-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/o;

    invoke-virtual {v0, p1, p2}, Lo5/o;->e(Lo5/n;Lg5/x;)Lg5/f;

    move-result-object p1

    return-object p1
.end method

.method public c(Lo5/l;Lg5/x;)Lg5/f;
    .locals 1

    const-string v0, "access cannot be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1, p2}, Lo5/h;->b(Lo5/n;Lg5/x;)Lg5/f;

    move-result-object p1
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :try_start_1
    new-instance v0, Lo5/e;

    invoke-direct {v0, p1, p2}, Lo5/e;-><init>(Lo5/l;Lg5/x;)V
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception p1

    new-instance p2, Lo5/p;

    const-string v0, "Creating a LegacyProtoKey failed"

    invoke-direct {p2, v0, p1}, Lo5/p;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public declared-synchronized d(Lo5/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lo5/n;",
            ">(",
            "Lo5/b<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lo5/o$b;

    iget-object v1, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/o;

    invoke-direct {v0, v1}, Lo5/o$b;-><init>(Lo5/o;)V

    invoke-virtual {v0, p1}, Lo5/o$b;->f(Lo5/b;)Lo5/o$b;

    move-result-object p1

    invoke-virtual {p1}, Lo5/o$b;->e()Lo5/o;

    move-result-object p1

    iget-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized e(Lo5/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<KeyT:",
            "Lg5/f;",
            "SerializationT::",
            "Lo5/n;",
            ">(",
            "Lo5/c<",
            "TKeyT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lo5/o$b;

    iget-object v1, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/o;

    invoke-direct {v0, v1}, Lo5/o$b;-><init>(Lo5/o;)V

    invoke-virtual {v0, p1}, Lo5/o$b;->g(Lo5/c;)Lo5/o$b;

    move-result-object p1

    invoke-virtual {p1}, Lo5/o$b;->e()Lo5/o;

    move-result-object p1

    iget-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized f(Lo5/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<SerializationT::",
            "Lo5/n;",
            ">(",
            "Lo5/i<",
            "TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lo5/o$b;

    iget-object v1, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/o;

    invoke-direct {v0, v1}, Lo5/o$b;-><init>(Lo5/o;)V

    invoke-virtual {v0, p1}, Lo5/o$b;->h(Lo5/i;)Lo5/o$b;

    move-result-object p1

    invoke-virtual {p1}, Lo5/o$b;->e()Lo5/o;

    move-result-object p1

    iget-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized g(Lo5/j;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ParametersT:",
            "Lg5/t;",
            "SerializationT::",
            "Lo5/n;",
            ">(",
            "Lo5/j<",
            "TParametersT;TSerializationT;>;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    new-instance v0, Lo5/o$b;

    iget-object v1, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo5/o;

    invoke-direct {v0, v1}, Lo5/o$b;-><init>(Lo5/o;)V

    invoke-virtual {v0, p1}, Lo5/o$b;->i(Lo5/j;)Lo5/o$b;

    move-result-object p1

    invoke-virtual {p1}, Lo5/o$b;->e()Lo5/o;

    move-result-object p1

    iget-object v0, p0, Lo5/h;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
