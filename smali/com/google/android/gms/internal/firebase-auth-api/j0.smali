.class abstract Lcom/google/android/gms/internal/firebase-auth-api/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/l0;


# instance fields
.field protected final a:I

.field final b:Lcom/google/android/gms/internal/firebase-auth-api/g0;

.field protected c:Lw5/f;

.field protected d:Lcom/google/firebase/auth/a0;

.field protected e:Ljava/lang/Object;

.field protected f:La6/r;

.field protected g:Lcom/google/android/gms/internal/firebase-auth-api/y;

.field protected final h:Ljava/util/List;

.field protected i:Ljava/util/concurrent/Executor;

.field protected j:Lcom/google/android/gms/internal/firebase-auth-api/j2;

.field protected k:Lcom/google/android/gms/internal/firebase-auth-api/z1;

.field protected l:Lcom/google/android/gms/internal/firebase-auth-api/n1;

.field protected m:Lcom/google/android/gms/internal/firebase-auth-api/s2;

.field protected n:Ljava/lang/String;

.field protected o:Ljava/lang/String;

.field protected p:Lcom/google/firebase/auth/h;

.field protected q:Ljava/lang/String;

.field protected r:Ljava/lang/String;

.field protected s:Lcom/google/android/gms/internal/firebase-auth-api/wv;

.field protected t:Lcom/google/android/gms/internal/firebase-auth-api/i2;

.field protected u:Lcom/google/android/gms/internal/firebase-auth-api/f2;

.field private v:Z

.field w:Ljava/lang/Object;

.field x:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/g0;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/g0;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/j0;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->b:Lcom/google/android/gms/internal/firebase-auth-api/g0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->h:Ljava/util/List;

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->a:I

    return-void
.end method

.method static bridge synthetic h(Lcom/google/android/gms/internal/firebase-auth-api/j0;Z)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->v:Z

    return-void
.end method

.method static bridge synthetic i(Lcom/google/android/gms/internal/firebase-auth-api/j0;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/j0;->b()V

    iget-boolean p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->v:Z

    const-string v0, "no success or failure set on method implementation"

    invoke-static {p0, v0}, Lc4/s;->m(ZLjava/lang/Object;)V

    return-void
.end method

.method static bridge synthetic j(Lcom/google/android/gms/internal/firebase-auth-api/j0;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->f:La6/r;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, La6/r;->z(Lcom/google/android/gms/common/api/Status;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract b()V
.end method

.method public final c(Ljava/lang/Object;)Lcom/google/android/gms/internal/firebase-auth-api/j0;
    .locals 1

    const-string v0, "external callback cannot be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->e:Ljava/lang/Object;

    return-object p0
.end method

.method public final d(La6/r;)Lcom/google/android/gms/internal/firebase-auth-api/j0;
    .locals 1

    const-string v0, "external failure callback cannot be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La6/r;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->f:La6/r;

    return-object p0
.end method

.method public final e(Lw5/f;)Lcom/google/android/gms/internal/firebase-auth-api/j0;
    .locals 1

    const-string v0, "firebaseApp cannot be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw5/f;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->c:Lw5/f;

    return-object p0
.end method

.method public final f(Lcom/google/firebase/auth/a0;)Lcom/google/android/gms/internal/firebase-auth-api/j0;
    .locals 1

    const-string v0, "firebaseUser cannot be null"

    invoke-static {p1, v0}, Lc4/s;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/a0;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->d:Lcom/google/firebase/auth/a0;

    return-object p0
.end method

.method public final g(Lcom/google/firebase/auth/q0$b;Landroid/app/Activity;Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/j0;
    .locals 1

    invoke-static {p4, p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/x0;->a(Ljava/lang/String;Lcom/google/firebase/auth/q0$b;Lcom/google/android/gms/internal/firebase-auth-api/j0;)Lcom/google/firebase/auth/q0$b;

    move-result-object p1

    iget-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->h:Ljava/util/List;

    monitor-enter p4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->h:Ljava/util/List;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/auth/q0$b;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->h:Ljava/util/List;

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/z;->a(Landroid/app/Activity;Ljava/util/List;)V

    :cond_0
    invoke-static {p3}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->i:Ljava/util/concurrent/Executor;

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final k(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->v:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->x:Lcom/google/android/gms/common/api/Status;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->g:Lcom/google/android/gms/internal/firebase-auth-api/y;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/y;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public final l(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->v:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->w:Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j0;->g:Lcom/google/android/gms/internal/firebase-auth-api/y;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/y;->a(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method
