.class public final synthetic Ll6/d4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/e4;

.field public final synthetic b:Lq6/n;


# direct methods
.method public synthetic constructor <init>(Ll6/e4;Lq6/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/d4;->a:Ll6/e4;

    iput-object p2, p0, Ll6/d4;->b:Lq6/n;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ll6/d4;->a:Ll6/e4;

    iget-object v1, p0, Ll6/d4;->b:Lq6/n;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, p1}, Ll6/e4;->m(Ll6/e4;Lq6/n;Landroid/database/Cursor;)V

    return-void
.end method
