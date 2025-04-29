.class Ll6/z2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/database/sqlite/SQLiteTransactionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll6/z2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ll6/z2;


# direct methods
.method constructor <init>(Ll6/z2;)V
    .locals 0

    iput-object p1, p0, Ll6/z2$a;->a:Ll6/z2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBegin()V
    .locals 1

    iget-object v0, p0, Ll6/z2$a;->a:Ll6/z2;

    invoke-static {v0}, Ll6/z2;->p(Ll6/z2;)Ll6/h2;

    move-result-object v0

    invoke-virtual {v0}, Ll6/h2;->j()V

    return-void
.end method

.method public onCommit()V
    .locals 1

    iget-object v0, p0, Ll6/z2$a;->a:Ll6/z2;

    invoke-static {v0}, Ll6/z2;->p(Ll6/z2;)Ll6/h2;

    move-result-object v0

    invoke-virtual {v0}, Ll6/h2;->g()V

    return-void
.end method

.method public onRollback()V
    .locals 0

    return-void
.end method
