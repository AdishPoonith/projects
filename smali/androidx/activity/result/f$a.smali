.class public final Landroidx/activity/result/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/activity/result/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Le/d$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Le/d$b;->a:Le/d$b;

    iput-object v0, p0, Landroidx/activity/result/f$a;->a:Le/d$f;

    return-void
.end method


# virtual methods
.method public final a()Landroidx/activity/result/f;
    .locals 2

    new-instance v0, Landroidx/activity/result/f;

    invoke-direct {v0}, Landroidx/activity/result/f;-><init>()V

    iget-object v1, p0, Landroidx/activity/result/f$a;->a:Le/d$f;

    invoke-virtual {v0, v1}, Landroidx/activity/result/f;->b(Le/d$f;)V

    return-object v0
.end method

.method public final b(Le/d$f;)Landroidx/activity/result/f$a;
    .locals 1

    const-string v0, "mediaType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/activity/result/f$a;->a:Le/d$f;

    return-object p0
.end method
