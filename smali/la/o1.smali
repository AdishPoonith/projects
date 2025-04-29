.class public final Lla/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/util/concurrent/Executor;)Lla/g0;
    .locals 1

    instance-of v0, p0, Lla/z0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lla/z0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Lla/z0;->j:Lla/g0;

    if-nez v0, :cond_2

    :cond_1
    new-instance v0, Lla/n1;

    invoke-direct {v0, p0}, Lla/n1;-><init>(Ljava/util/concurrent/Executor;)V

    :cond_2
    return-object v0
.end method

.method public static final b(Ljava/util/concurrent/ExecutorService;)Lla/m1;
    .locals 1

    new-instance v0, Lla/n1;

    invoke-direct {v0, p0}, Lla/n1;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
