.class public final Lp0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/v0$a;
    }
.end annotation


# static fields
.field public static final d:Lp0/v0$a;

.field private static volatile e:Lp0/v0;


# instance fields
.field private final a:Le0/a;

.field private final b:Lp0/u0;

.field private c:Lp0/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/v0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/v0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lp0/v0;->d:Lp0/v0$a;

    return-void
.end method

.method public constructor <init>(Le0/a;Lp0/u0;)V
    .locals 1

    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/v0;->a:Le0/a;

    iput-object p2, p0, Lp0/v0;->b:Lp0/u0;

    return-void
.end method

.method public static final synthetic a()Lp0/v0;
    .locals 1

    sget-object v0, Lp0/v0;->e:Lp0/v0;

    return-object v0
.end method

.method public static final synthetic b(Lp0/v0;)V
    .locals 0

    sput-object p0, Lp0/v0;->e:Lp0/v0;

    return-void
.end method

.method private final e(Lp0/t0;Lp0/t0;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.facebook.sdk.EXTRA_OLD_PROFILE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "com.facebook.sdk.EXTRA_NEW_PROFILE"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, Lp0/v0;->a:Le0/a;

    invoke-virtual {p1, v0}, Le0/a;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method private final g(Lp0/t0;Z)V
    .locals 1

    iget-object v0, p0, Lp0/v0;->c:Lp0/t0;

    iput-object p1, p0, Lp0/v0;->c:Lp0/t0;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lp0/v0;->b:Lp0/u0;

    if-eqz p1, :cond_0

    invoke-virtual {p2, p1}, Lp0/u0;->c(Lp0/t0;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp0/u0;->a()V

    :cond_1
    :goto_0
    sget-object p2, Lf1/l0;->a:Lf1/l0;

    invoke-static {v0, p1}, Lf1/l0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-direct {p0, v0, p1}, Lp0/v0;->e(Lp0/t0;Lp0/t0;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final c()Lp0/t0;
    .locals 1

    iget-object v0, p0, Lp0/v0;->c:Lp0/t0;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lp0/v0;->b:Lp0/u0;

    invoke-virtual {v0}, Lp0/u0;->b()Lp0/t0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0, v1}, Lp0/v0;->g(Lp0/t0;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final f(Lp0/t0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lp0/v0;->g(Lp0/t0;Z)V

    return-void
.end method
