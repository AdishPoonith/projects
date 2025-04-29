.class public final Lb4/i;
.super Lb4/j;
.source "SourceFile"


# static fields
.field public static final f:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lb4/j;->a:I

    sput v0, Lb4/i;->f:I

    return-void
.end method

.method public static c(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    invoke-static {p0}, Lb4/j;->c(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method public static d(Landroid/content/Context;)Landroid/content/res/Resources;
    .locals 0

    invoke-static {p0}, Lb4/j;->d(Landroid/content/Context;)Landroid/content/res/Resources;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;I)I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lb4/j;->f(Landroid/content/Context;I)I

    move-result p0

    return p0
.end method
