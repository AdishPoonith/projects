.class public final Lla/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lla/g1;
    .locals 2

    new-instance v0, Lla/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-direct {v0, v1}, Lla/g;-><init>(Ljava/lang/Thread;)V

    return-object v0
.end method
