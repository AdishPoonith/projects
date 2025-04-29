.class public final Lq4/a0;
.super Lc4/h;
.source "SourceFile"


# instance fields
.field private final R:Ls/g;

.field private final S:Ls/g;

.field private final T:Ls/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lc4/e;Lcom/google/android/gms/common/api/internal/e;Lcom/google/android/gms/common/api/internal/m;)V
    .locals 7

    const/16 v3, 0x17

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lc4/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILc4/e;Lcom/google/android/gms/common/api/internal/e;Lcom/google/android/gms/common/api/internal/m;)V

    new-instance p1, Ls/g;

    invoke-direct {p1}, Ls/g;-><init>()V

    iput-object p1, p0, Lq4/a0;->R:Ls/g;

    new-instance p1, Ls/g;

    invoke-direct {p1}, Ls/g;-><init>()V

    iput-object p1, p0, Lq4/a0;->S:Ls/g;

    new-instance p1, Ls/g;

    invoke-direct {p1}, Ls/g;-><init>()V

    iput-object p1, p0, Lq4/a0;->T:Ls/g;

    return-void
.end method

.method private final l0(Lb4/d;)Z
    .locals 7

    invoke-virtual {p0}, Lc4/c;->j()[Lb4/d;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {p1}, Lb4/d;->B()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lb4/d;->B()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_3

    return v1

    :cond_3
    invoke-virtual {v4}, Lb4/d;->C()J

    move-result-wide v2

    invoke-virtual {p1}, Lb4/d;->C()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-ltz p1, :cond_4

    const/4 p1, 0x1

    return p1

    :cond_4
    return v1
.end method


# virtual methods
.method protected final D()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.location.internal.GoogleLocationManagerService.START"

    return-object v0
.end method

.method public final L(I)V
    .locals 1

    invoke-super {p0, p1}, Lc4/c;->L(I)V

    iget-object p1, p0, Lq4/a0;->R:Ls/g;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lq4/a0;->R:Ls/g;

    invoke-virtual {v0}, Ls/g;->clear()V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v0, p0, Lq4/a0;->S:Ls/g;

    monitor-enter v0

    :try_start_1
    iget-object p1, p0, Lq4/a0;->S:Ls/g;

    invoke-virtual {p1}, Ls/g;->clear()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p1, p0, Lq4/a0;->T:Ls/g;

    monitor-enter p1

    :try_start_2
    iget-object v0, p0, Lq4/a0;->T:Ls/g;

    invoke-virtual {v0}, Ls/g;->clear()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final Q()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final h()I
    .locals 1

    const v0, 0xb2c988

    return v0
.end method

.method public final k0(Lcom/google/android/gms/common/api/internal/j$a;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 9

    iget-object v0, p0, Lq4/a0;->S:Ls/g;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lq4/a0;->S:Ls/g;

    invoke-virtual {v1, p1}, Ls/g;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lq4/y;

    if-nez v5, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :cond_0
    invoke-virtual {v5}, Lq4/y;->zzh()V

    if-eqz p2, :cond_2

    sget-object p1, Lt4/r;->j:Lb4/d;

    invoke-direct {p0, p1}, Lq4/a0;->l0(Lb4/d;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lq4/b1;

    const/4 p2, 0x0

    invoke-static {p2, v5, p2, p2}, Lq4/b0;->B(Landroid/os/IInterface;Lt4/v;Ljava/lang/String;Ljava/lang/String;)Lq4/b0;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Lq4/q;

    invoke-direct {v2, p0, v1, p3}, Lq4/q;-><init>(Lq4/a0;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {p1, p2, v2}, Lq4/b1;->X(Lq4/b0;Lcom/google/android/gms/common/api/internal/g;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lq4/b1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v7, Lq4/r;

    invoke-direct {v7, p2, p3}, Lq4/r;-><init>(Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    new-instance p2, Lq4/f0;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p2

    invoke-direct/range {v1 .. v8}, Lq4/f0;-><init>(ILq4/d0;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lq4/b1;->n0(Lq4/f0;)V

    goto :goto_0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final m0(Lq4/u;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    invoke-interface/range {p1 .. p1}, Lq4/u;->zza()Lcom/google/android/gms/common/api/internal/j;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/common/api/internal/j;->b()Lcom/google/android/gms/common/api/internal/j$a;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Lt4/r;->j:Lb4/d;

    invoke-direct {v1, v5}, Lq4/a0;->l0(Lb4/d;)Z

    move-result v5

    iget-object v6, v1, Lq4/a0;->S:Ls/g;

    monitor-enter v6

    :try_start_0
    iget-object v7, v1, Lq4/a0;->S:Ls/g;

    invoke-virtual {v7, v4}, Ls/g;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq4/y;

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v3}, Lq4/y;->H2(Lcom/google/android/gms/common/api/internal/j;)Lq4/y;

    move-object v13, v7

    move-object v7, v8

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v3, Lq4/y;

    move-object/from16 v9, p1

    invoke-direct {v3, v9}, Lq4/y;-><init>(Lq4/u;)V

    iget-object v9, v1, Lq4/a0;->S:Ls/g;

    invoke-virtual {v9, v4, v3}, Ls/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v13, v3

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lc4/c;->x()Landroid/content/Context;

    invoke-virtual {v4}, Lcom/google/android/gms/common/api/internal/j$a;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lq4/b1;

    invoke-static {v7, v13, v8, v3}, Lq4/b0;->B(Landroid/os/IInterface;Lt4/v;Ljava/lang/String;Ljava/lang/String;)Lq4/b0;

    move-result-object v3

    new-instance v5, Lq4/q;

    invoke-direct {v5, v1, v8, v2}, Lq4/q;-><init>(Lq4/a0;Ljava/lang/Object;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    invoke-interface {v4, v3, v0, v5}, Lq4/b1;->T(Lq4/b0;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/common/api/internal/g;)V

    goto :goto_2

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lc4/c;->C()Landroid/os/IInterface;

    move-result-object v4

    check-cast v4, Lq4/b1;

    new-instance v5, Lcom/google/android/gms/location/LocationRequest$a;

    invoke-direct {v5, v0}, Lcom/google/android/gms/location/LocationRequest$a;-><init>(Lcom/google/android/gms/location/LocationRequest;)V

    invoke-virtual {v5, v8}, Lcom/google/android/gms/location/LocationRequest$a;->f(Ljava/lang/String;)Lcom/google/android/gms/location/LocationRequest$a;

    invoke-virtual {v5}, Lcom/google/android/gms/location/LocationRequest$a;->a()Lcom/google/android/gms/location/LocationRequest;

    move-result-object v0

    invoke-static {v8, v0}, Lq4/d0;->B(Ljava/lang/String;Lcom/google/android/gms/location/LocationRequest;)Lq4/d0;

    move-result-object v11

    new-instance v15, Lq4/s;

    invoke-direct {v15, v2, v13}, Lq4/s;-><init>(Lcom/google/android/gms/tasks/TaskCompletionSource;Lt4/v;)V

    new-instance v0, Lq4/f0;

    const/4 v10, 0x1

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object v9, v0

    move-object/from16 v16, v3

    invoke-direct/range {v9 .. v16}, Lq4/f0;-><init>(ILq4/d0;Landroid/os/IBinder;Landroid/os/IBinder;Landroid/app/PendingIntent;Landroid/os/IBinder;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Lq4/b1;->n0(Lq4/f0;)V

    :goto_2
    monitor-exit v6

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected final synthetic r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.location.internal.IGoogleLocationManagerService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lq4/b1;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lq4/b1;

    goto :goto_0

    :cond_1
    new-instance v0, Lq4/a1;

    invoke-direct {v0, p1}, Lq4/a1;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final u()[Lb4/d;
    .locals 1

    sget-object v0, Lt4/r;->l:[Lb4/d;

    return-object v0
.end method
