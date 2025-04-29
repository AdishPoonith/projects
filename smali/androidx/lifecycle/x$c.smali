.class public Landroidx/lifecycle/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/x$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/x$c$a;
    }
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/x$c$a;

.field public static final c:Lc0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc0/a$b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/x$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/x$c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Landroidx/lifecycle/x$c;->b:Landroidx/lifecycle/x$c$a;

    sget-object v0, Landroidx/lifecycle/x$c$a$a;->a:Landroidx/lifecycle/x$c$a$a;

    sput-object v0, Landroidx/lifecycle/x$c;->c:Lc0/a$b;

    return-void
.end method
