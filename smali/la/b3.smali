.class public final Lla/b3;
.super Lv9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lla/b3$a;
    }
.end annotation


# static fields
.field public static final l:Lla/b3$a;


# instance fields
.field public k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lla/b3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lla/b3$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lla/b3;->l:Lla/b3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lla/b3;->l:Lla/b3$a;

    invoke-direct {p0, v0}, Lv9/a;-><init>(Lv9/g$c;)V

    return-void
.end method
