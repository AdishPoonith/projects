.class public final Lq0/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq0/o$b;,
        Lq0/o$a;
    }
.end annotation


# static fields
.field public static final b:Lq0/o$a;

.field private static final c:Ljava/lang/String;


# instance fields
.field private final a:Lq0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq0/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq0/o$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lq0/o;->b:Lq0/o$a;

    const-class v0, Lq0/o;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq0/o;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lp0/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lq0/r;

    invoke-direct {v0, p1, p2, p3}, Lq0/r;-><init>(Landroid/content/Context;Ljava/lang/String;Lp0/a;)V

    iput-object v0, p0, Lq0/o;->a:Lq0/r;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Lp0/a;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lq0/o;-><init>(Landroid/content/Context;Ljava/lang/String;Lp0/a;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lq0/o;->a:Lq0/r;

    invoke-virtual {v0}, Lq0/r;->j()V

    return-void
.end method

.method public final b(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lq0/o;->a:Lq0/r;

    invoke-virtual {v0, p1, p2}, Lq0/r;->l(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
