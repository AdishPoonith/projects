.class public final Lt0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/h$a;
    }
.end annotation


# static fields
.field public static final a:Lt0/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt0/h;

    invoke-direct {v0}, Lt0/h;-><init>()V

    sput-object v0, Lt0/h;->a:Lt0/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lu0/a;Landroid/view/View;Landroid/view/View;)Lt0/h$a;
    .locals 3

    const-class v0, Lt0/h;

    invoke-static {v0}, Lk1/a;->d(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, "mapping"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "rootView"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hostView"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt0/h$a;

    invoke-direct {v1, p0, p1, p2}, Lt0/h$a;-><init>(Lu0/a;Landroid/view/View;Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    move-exception p0

    invoke-static {p0, v0}, Lk1/a;->b(Ljava/lang/Throwable;Ljava/lang/Object;)V

    return-object v2
.end method
