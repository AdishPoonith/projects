.class Lla/o2;
.super Lla/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lla/a<",
        "Ls9/u;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lv9/g;Z)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p2}, Lla/a;-><init>(Lv9/g;ZZ)V

    return-void
.end method


# virtual methods
.method protected j0(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lla/a;->getContext()Lv9/g;

    move-result-object v0

    invoke-static {v0, p1}, Lla/j0;->a(Lv9/g;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
