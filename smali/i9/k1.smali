.class public Li9/k1;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field private final j:Li9/j1;

.field private final k:Li9/y0;

.field private final l:Z


# direct methods
.method public constructor <init>(Li9/j1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Li9/k1;-><init>(Li9/j1;Li9/y0;)V

    return-void
.end method

.method public constructor <init>(Li9/j1;Li9/y0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Li9/k1;-><init>(Li9/j1;Li9/y0;Z)V

    return-void
.end method

.method constructor <init>(Li9/j1;Li9/y0;Z)V
    .locals 2

    invoke-static {p1}, Li9/j1;->g(Li9/j1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Li9/j1;->l()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Li9/k1;->j:Li9/j1;

    iput-object p2, p0, Li9/k1;->k:Li9/y0;

    iput-boolean p3, p0, Li9/k1;->l:Z

    invoke-virtual {p0}, Li9/k1;->fillInStackTrace()Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Li9/j1;
    .locals 1

    iget-object v0, p0, Li9/k1;->j:Li9/j1;

    return-object v0
.end method

.method public declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Li9/k1;->l:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Ljava/lang/Exception;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
