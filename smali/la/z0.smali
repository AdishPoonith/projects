.class final Lla/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final j:Lla/g0;


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lla/z0;->j:Lla/g0;

    sget-object v1, Lv9/h;->j:Lv9/h;

    invoke-virtual {v0, v1, p1}, Lla/g0;->h0(Lv9/g;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lla/z0;->j:Lla/g0;

    invoke-virtual {v0}, Lla/g0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
