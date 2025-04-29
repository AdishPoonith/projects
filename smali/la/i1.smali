.class public abstract Lla/i1;
.super Lla/g1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lla/g1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract t0()Ljava/lang/Thread;
.end method

.method protected u0(JLla/h1$b;)V
    .locals 1

    sget-object v0, Lla/p0;->q:Lla/p0;

    invoke-virtual {v0, p1, p2, p3}, Lla/h1;->G0(JLla/h1$b;)V

    return-void
.end method

.method protected final v0()V
    .locals 2

    invoke-virtual {p0}, Lla/i1;->t0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lla/c;->a()Lla/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
