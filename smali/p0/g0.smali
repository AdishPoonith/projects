.class public final Lp0/g0;
.super Lp0/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/g0$a;
    }
.end annotation


# static fields
.field public static final k:Lp0/g0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/g0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp0/g0;->k:Lp0/g0$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lp0/s;-><init>(Ljava/lang/String;)V

    return-void
.end method
