.class public Landroidx/lifecycle/x$a;
.super Landroidx/lifecycle/x$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/x$a$a;
    }
.end annotation


# static fields
.field public static final d:Landroidx/lifecycle/x$a$a;

.field public static final e:Lc0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a$b<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/x$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/x$a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Landroidx/lifecycle/x$a;->d:Landroidx/lifecycle/x$a$a;

    sget-object v0, Landroidx/lifecycle/x$a$a$a;->a:Landroidx/lifecycle/x$a$a$a;

    sput-object v0, Landroidx/lifecycle/x$a;->e:Lc0/a$b;

    return-void
.end method
