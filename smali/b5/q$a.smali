.class Lb5/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb5/q$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb5/q;->e(Lb5/c;)Lb5/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb5/c;


# direct methods
.method constructor <init>(Lb5/c;)V
    .locals 0

    iput-object p1, p0, Lb5/q$a;->a:Lb5/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lb5/q;Ljava/lang/CharSequence;)Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb5/q$a;->b(Lb5/q;Ljava/lang/CharSequence;)Lb5/q$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lb5/q;Ljava/lang/CharSequence;)Lb5/q$b;
    .locals 1

    new-instance v0, Lb5/q$a$a;

    invoke-direct {v0, p0, p1, p2}, Lb5/q$a$a;-><init>(Lb5/q$a;Lb5/q;Ljava/lang/CharSequence;)V

    return-object v0
.end method
