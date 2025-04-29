.class public final Lg9/c$a;
.super Landroid/widget/Toast$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg9/c;->I(Lr8/j;Lr8/k$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg9/c;


# direct methods
.method constructor <init>(Lg9/c;)V
    .locals 0

    iput-object p1, p0, Lg9/c$a;->a:Lg9/c;

    invoke-direct {p0}, Landroid/widget/Toast$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onToastHidden()V
    .locals 2

    invoke-super {p0}, Landroid/widget/Toast$Callback;->onToastHidden()V

    iget-object v0, p0, Lg9/c$a;->a:Lg9/c;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lg9/c;->b(Lg9/c;Landroid/widget/Toast;)V

    return-void
.end method
