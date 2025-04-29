.class Lcom/google/firebase/storage/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/storage/d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lw5/f;

.field private final c:Ls6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/b<",
            "La6/b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ls6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls6/b<",
            "Lz5/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw5/f;Ls6/b;Ls6/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/f;",
            "Ls6/b<",
            "La6/b;",
            ">;",
            "Ls6/b<",
            "Lz5/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/storage/e;->a:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/firebase/storage/e;->b:Lw5/f;

    iput-object p2, p0, Lcom/google/firebase/storage/e;->c:Ls6/b;

    iput-object p3, p0, Lcom/google/firebase/storage/e;->d:Ls6/b;

    return-void
.end method


# virtual methods
.method declared-synchronized a(Ljava/lang/String;)Lcom/google/firebase/storage/d;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/storage/e;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/firebase/storage/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/storage/d;

    iget-object v1, p0, Lcom/google/firebase/storage/e;->b:Lw5/f;

    iget-object v2, p0, Lcom/google/firebase/storage/e;->c:Ls6/b;

    iget-object v3, p0, Lcom/google/firebase/storage/e;->d:Ls6/b;

    invoke-direct {v0, p1, v1, v2, v3}, Lcom/google/firebase/storage/d;-><init>(Ljava/lang/String;Lw5/f;Ls6/b;Ls6/b;)V

    iget-object v1, p0, Lcom/google/firebase/storage/e;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
