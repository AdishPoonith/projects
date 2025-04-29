.class final Lla/v;
.super Lla/c2;
.source "SourceFile"

# interfaces
.implements Lla/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/c2;",
        "Lla/u<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lla/v1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lla/c2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lla/c2;->l0(Lla/v1;)V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lla/c2;->r0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public c0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e0(Lv9/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lla/c2;->D(Lv9/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    return-object p1
.end method

.method public m()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lla/c2;->X()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public z(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, Lla/z;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lla/z;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-virtual {p0, v0}, Lla/c2;->r0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
