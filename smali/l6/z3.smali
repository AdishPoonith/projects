.class public final synthetic Ll6/z3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ll6/e4$b;


# direct methods
.method public synthetic constructor <init>(Ll6/e4$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/z3;->a:Ll6/e4$b;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ll6/z3;->a:Ll6/e4$b;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Ll6/e4;->k(Ll6/e4$b;Landroid/database/Cursor;)V

    return-void
.end method
