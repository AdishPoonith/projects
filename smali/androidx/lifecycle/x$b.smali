.class public interface abstract Landroidx/lifecycle/x$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/x$b$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/x$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/x$b$a;->a:Landroidx/lifecycle/x$b$a;

    sput-object v0, Landroidx/lifecycle/x$b;->a:Landroidx/lifecycle/x$b$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Class;)Landroidx/lifecycle/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Class;Lc0/a;)Landroidx/lifecycle/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/w;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lc0/a;",
            ")TT;"
        }
    .end annotation
.end method
