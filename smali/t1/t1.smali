.class public final Lt1/t1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt1/t1$a;
    }
.end annotation


# static fields
.field public static final b:Lt1/t1;


# instance fields
.field private final a:Lt1/t1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    new-instance v0, Lt1/t1;

    invoke-direct {v0}, Lt1/t1;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lt1/t1;

    sget-object v1, Lt1/t1$a;->b:Lt1/t1$a;

    invoke-direct {v0, v1}, Lt1/t1;-><init>(Lt1/t1$a;)V

    :goto_0
    sput-object v0, Lt1/t1;->b:Lt1/t1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt1/t1;-><init>(Lt1/t1$a;)V

    sget v0, Lp3/n0;->a:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lp3/a;->f(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/media/metrics/LogSessionId;)V
    .locals 1

    new-instance v0, Lt1/t1$a;

    invoke-direct {v0, p1}, Lt1/t1$a;-><init>(Landroid/media/metrics/LogSessionId;)V

    invoke-direct {p0, v0}, Lt1/t1;-><init>(Lt1/t1$a;)V

    return-void
.end method

.method private constructor <init>(Lt1/t1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt1/t1;->a:Lt1/t1$a;

    return-void
.end method


# virtual methods
.method public a()Landroid/media/metrics/LogSessionId;
    .locals 1

    iget-object v0, p0, Lt1/t1;->a:Lt1/t1$a;

    invoke-static {v0}, Lp3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt1/t1$a;

    iget-object v0, v0, Lt1/t1$a;->a:Landroid/media/metrics/LogSessionId;

    return-object v0
.end method
