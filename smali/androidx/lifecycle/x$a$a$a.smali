.class final Landroidx/lifecycle/x$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x$a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc0/a$b<",
        "Landroid/app/Application;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/x$a$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/lifecycle/x$a$a$a;

    invoke-direct {v0}, Landroidx/lifecycle/x$a$a$a;-><init>()V

    sput-object v0, Landroidx/lifecycle/x$a$a$a;->a:Landroidx/lifecycle/x$a$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
