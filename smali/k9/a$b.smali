.class Lk9/a$b;
.super Lk9/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk9/a;->flush()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final k:Lr9/b;

.field final synthetic l:Lk9/a;


# direct methods
.method constructor <init>(Lk9/a;)V
    .locals 1

    iput-object p1, p0, Lk9/a$b;->l:Lk9/a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lk9/a$e;-><init>(Lk9/a;Lk9/a$a;)V

    invoke-static {}, Lr9/c;->e()Lr9/b;

    move-result-object p1

    iput-object p1, p0, Lk9/a$b;->k:Lr9/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const-string v0, "WriteRunnable.runFlush"

    invoke-static {v0}, Lr9/c;->f(Ljava/lang/String;)V

    iget-object v0, p0, Lk9/a$b;->k:Lr9/b;

    invoke-static {v0}, Lr9/c;->d(Lr9/b;)V

    new-instance v0, Lokio/c;

    invoke-direct {v0}, Lokio/c;-><init>()V

    :try_start_0
    iget-object v1, p0, Lk9/a$b;->l:Lk9/a;

    invoke-static {v1}, Lk9/a;->a(Lk9/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Lk9/a$b;->l:Lk9/a;

    invoke-static {v2}, Lk9/a;->b(Lk9/a;)Lokio/c;

    move-result-object v2

    iget-object v3, p0, Lk9/a$b;->l:Lk9/a;

    invoke-static {v3}, Lk9/a;->b(Lk9/a;)Lokio/c;

    move-result-object v3

    invoke-virtual {v3}, Lokio/c;->b0()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lokio/c;->j(Lokio/c;J)V

    iget-object v2, p0, Lk9/a$b;->l:Lk9/a;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lk9/a;->l(Lk9/a;Z)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Lk9/a$b;->l:Lk9/a;

    invoke-static {v1}, Lk9/a;->k(Lk9/a;)Lokio/m;

    move-result-object v1

    invoke-virtual {v0}, Lokio/c;->b0()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lokio/m;->j(Lokio/c;J)V

    iget-object v0, p0, Lk9/a$b;->l:Lk9/a;

    invoke-static {v0}, Lk9/a;->k(Lk9/a;)Lokio/m;

    move-result-object v0

    invoke-interface {v0}, Lokio/m;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v0, "WriteRunnable.runFlush"

    invoke-static {v0}, Lr9/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    const-string v1, "WriteRunnable.runFlush"

    invoke-static {v1}, Lr9/c;->h(Ljava/lang/String;)V

    throw v0
.end method
