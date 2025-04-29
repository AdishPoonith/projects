.class public final Landroidx/activity/result/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/activity/result/f$a;
    }
.end annotation


# instance fields
.field private a:Le/d$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le/d$b;->a:Le/d$b;

    iput-object v0, p0, Landroidx/activity/result/f;->a:Le/d$f;

    return-void
.end method


# virtual methods
.method public final a()Le/d$f;
    .locals 1

    iget-object v0, p0, Landroidx/activity/result/f;->a:Le/d$f;

    return-object v0
.end method

.method public final b(Le/d$f;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/result/f;->a:Le/d$f;

    return-void
.end method
