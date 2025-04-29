.class Lla/s0;
.super Lla/a;
.source "SourceFile"

# interfaces
.implements Lla/r0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/a<",
        "TT;>;",
        "Lla/r0<",
        "TT;>;"
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
