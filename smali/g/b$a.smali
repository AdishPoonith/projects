.class Lg/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/e$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lg/b;


# direct methods
.method constructor <init>(Lg/b;)V
    .locals 0

    iput-object p1, p0, Lg/b$a;->j:Lg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lg/b$a;->j:Lg/b;

    invoke-virtual {v0, p1}, Lg/b;->c(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
