.class public final Lp0/u;
.super Lp0/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/u$a;
    }
.end annotation


# static fields
.field public static final k:Lp0/u$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/u$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/u$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp0/u;->k:Lp0/u$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lp0/s;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lp0/s;-><init>(Ljava/lang/String;)V

    return-void
.end method
