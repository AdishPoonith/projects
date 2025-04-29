.class public final Lf1/x;
.super Lf1/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/x$a;
    }
.end annotation


# static fields
.field public static final c:Lf1/x$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf1/x$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf1/x$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lf1/x;->c:Lf1/x$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lf1/e;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    if-nez p2, :cond_0

    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    :cond_0
    sget-object v0, Lf1/x;->c:Lf1/x$a;

    invoke-virtual {v0, p1, p2}, Lf1/x$a;->a(Ljava/lang/String;Landroid/os/Bundle;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf1/e;->b(Landroid/net/Uri;)V

    return-void
.end method
