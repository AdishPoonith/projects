.class public final synthetic Ll6/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/n;


# instance fields
.field public final synthetic a:Ljava/util/SortedSet;

.field public final synthetic b:Lm6/q;

.field public final synthetic c:Lm6/l;


# direct methods
.method public synthetic constructor <init>(Ljava/util/SortedSet;Lm6/q;Lm6/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/z1;->a:Ljava/util/SortedSet;

    iput-object p2, p0, Ll6/z1;->b:Lm6/q;

    iput-object p3, p0, Ll6/z1;->c:Lm6/l;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Ll6/z1;->a:Ljava/util/SortedSet;

    iget-object v1, p0, Ll6/z1;->b:Lm6/q;

    iget-object v2, p0, Ll6/z1;->c:Lm6/l;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, v1, v2, p1}, Ll6/d2;->s(Ljava/util/SortedSet;Lm6/q;Lm6/l;Landroid/database/Cursor;)V

    return-void
.end method
