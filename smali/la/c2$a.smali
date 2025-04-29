.class final Lla/c2$a;
.super Lla/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lla/c2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/m<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final r:Lla/c2;


# direct methods
.method public constructor <init>(Lv9/d;Lla/c2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-TT;>;",
            "Lla/c2;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lla/m;-><init>(Lv9/d;I)V

    iput-object p2, p0, Lla/c2$a;->r:Lla/c2;

    return-void
.end method


# virtual methods
.method protected F()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method

.method public v(Lla/v1;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lla/c2$a;->r:Lla/c2;

    invoke-virtual {v0}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lla/c2$c;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lla/c2$c;

    invoke-virtual {v1}, Lla/c2$c;->e()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lla/z;

    if-eqz v1, :cond_1

    check-cast v0, Lla/z;

    iget-object p1, v0, Lla/z;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-interface {p1}, Lla/v1;->O()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method
