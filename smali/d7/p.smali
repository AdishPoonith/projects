.class public final Ld7/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/p$b;
    }
.end annotation


# static fields
.field private static volatile a:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "Ld7/d;",
            "Ld7/e;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile b:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "Ld7/f;",
            "Ld7/g;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile c:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "Ld7/u;",
            "Ld7/v;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile d:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "Ld7/d0;",
            "Ld7/e0;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile e:Li9/z0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/z0<",
            "Ld7/q;",
            "Ld7/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Li9/z0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/z0<",
            "Ld7/d;",
            "Ld7/e;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld7/p;->a:Li9/z0;

    if-nez v0, :cond_1

    const-class v1, Ld7/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Ld7/p;->a:Li9/z0;

    if-nez v0, :cond_0

    invoke-static {}, Li9/z0;->g()Li9/z0$b;

    move-result-object v0

    sget-object v2, Li9/z0$d;->l:Li9/z0$d;

    invoke-virtual {v0, v2}, Li9/z0$b;->f(Li9/z0$d;)Li9/z0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "BatchGetDocuments"

    invoke-static {v2, v3}, Li9/z0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->b(Ljava/lang/String;)Li9/z0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Li9/z0$b;->e(Z)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/d;->j0()Ld7/d;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->c(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/e;->f0()Ld7/e;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->d(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/z0$b;->a()Li9/z0;

    move-result-object v0

    sput-object v0, Ld7/p;->a:Li9/z0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static b()Li9/z0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/z0<",
            "Ld7/f;",
            "Ld7/g;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld7/p;->b:Li9/z0;

    if-nez v0, :cond_1

    const-class v1, Ld7/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Ld7/p;->b:Li9/z0;

    if-nez v0, :cond_0

    invoke-static {}, Li9/z0;->g()Li9/z0$b;

    move-result-object v0

    sget-object v2, Li9/z0$d;->j:Li9/z0$d;

    invoke-virtual {v0, v2}, Li9/z0$b;->f(Li9/z0$d;)Li9/z0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Commit"

    invoke-static {v2, v3}, Li9/z0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->b(Ljava/lang/String;)Li9/z0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Li9/z0$b;->e(Z)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/f;->j0()Ld7/f;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->c(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/g;->g0()Ld7/g;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->d(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/z0$b;->a()Li9/z0;

    move-result-object v0

    sput-object v0, Ld7/p;->b:Li9/z0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static c()Li9/z0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/z0<",
            "Ld7/q;",
            "Ld7/r;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld7/p;->e:Li9/z0;

    if-nez v0, :cond_1

    const-class v1, Ld7/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Ld7/p;->e:Li9/z0;

    if-nez v0, :cond_0

    invoke-static {}, Li9/z0;->g()Li9/z0$b;

    move-result-object v0

    sget-object v2, Li9/z0$d;->m:Li9/z0$d;

    invoke-virtual {v0, v2}, Li9/z0$b;->f(Li9/z0$d;)Li9/z0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Listen"

    invoke-static {v2, v3}, Li9/z0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->b(Ljava/lang/String;)Li9/z0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Li9/z0$b;->e(Z)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/q;->j0()Ld7/q;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->c(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/r;->f0()Ld7/r;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->d(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/z0$b;->a()Li9/z0;

    move-result-object v0

    sput-object v0, Ld7/p;->e:Li9/z0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static d()Li9/z0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/z0<",
            "Ld7/u;",
            "Ld7/v;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld7/p;->c:Li9/z0;

    if-nez v0, :cond_1

    const-class v1, Ld7/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Ld7/p;->c:Li9/z0;

    if-nez v0, :cond_0

    invoke-static {}, Li9/z0;->g()Li9/z0$b;

    move-result-object v0

    sget-object v2, Li9/z0$d;->l:Li9/z0$d;

    invoke-virtual {v0, v2}, Li9/z0$b;->f(Li9/z0$d;)Li9/z0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "RunAggregationQuery"

    invoke-static {v2, v3}, Li9/z0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->b(Ljava/lang/String;)Li9/z0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Li9/z0$b;->e(Z)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/u;->h0()Ld7/u;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->c(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/v;->f0()Ld7/v;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->d(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/z0$b;->a()Li9/z0;

    move-result-object v0

    sput-object v0, Ld7/p;->c:Li9/z0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static e()Li9/z0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Li9/z0<",
            "Ld7/d0;",
            "Ld7/e0;",
            ">;"
        }
    .end annotation

    sget-object v0, Ld7/p;->d:Li9/z0;

    if-nez v0, :cond_1

    const-class v1, Ld7/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Ld7/p;->d:Li9/z0;

    if-nez v0, :cond_0

    invoke-static {}, Li9/z0;->g()Li9/z0$b;

    move-result-object v0

    sget-object v2, Li9/z0$d;->m:Li9/z0$d;

    invoke-virtual {v0, v2}, Li9/z0$b;->f(Li9/z0$d;)Li9/z0$b;

    move-result-object v0

    const-string v2, "google.firestore.v1.Firestore"

    const-string v3, "Write"

    invoke-static {v2, v3}, Li9/z0;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->b(Ljava/lang/String;)Li9/z0$b;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Li9/z0$b;->e(Z)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/d0;->k0()Ld7/d0;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->c(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-static {}, Ld7/e0;->g0()Ld7/e0;

    move-result-object v2

    invoke-static {v2}, Lo9/b;->b(Lcom/google/protobuf/v0;)Li9/z0$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Li9/z0$b;->d(Li9/z0$c;)Li9/z0$b;

    move-result-object v0

    invoke-virtual {v0}, Li9/z0$b;->a()Li9/z0;

    move-result-object v0

    sput-object v0, Ld7/p;->d:Li9/z0;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static f(Li9/d;)Ld7/p$b;
    .locals 1

    new-instance v0, Ld7/p$a;

    invoke-direct {v0}, Ld7/p$a;-><init>()V

    invoke-static {v0, p0}, Lp9/a;->e(Lp9/b$a;Li9/d;)Lp9/b;

    move-result-object p0

    check-cast p0, Ld7/p$b;

    return-object p0
.end method
